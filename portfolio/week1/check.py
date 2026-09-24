# Tests to check correctness of triangle area program
# DO NOT ALTER ANYTHING IN THIS FILE!

import sys
import subprocess
import unittest

OS_INFO = """
This script cannot be used on Microsoft Windows systems!

Please run it in a Linux or macOS environment.
"""

BASE_COMMAND = ["kotlin", "--log-level=off", "run"]

USAGE_MESSAGE = b"Error: values for a, b, c required on command line\n"


def check_for_windows():
    if sys.platform == "win32":
        sys.exit(OS_INFO)


def run(command):
    return subprocess.run(command, capture_output=True, check=False)


class TriangleTests(unittest.TestCase):
    def test_no_args(self):
        result = run(BASE_COMMAND)
        self.assertEqual(result.stdout, USAGE_MESSAGE)
        self.assertEqual(result.returncode, 1)

    def test_one_arg(self):
        command = BASE_COMMAND + ["3.0"]
        result = run(command)
        self.assertEqual(result.stdout, USAGE_MESSAGE)
        self.assertEqual(result.returncode, 1)

    def test_two_args(self):
        command = BASE_COMMAND + ["3.0", "4.0"]
        result = run(command)
        self.assertEqual(result.stdout, USAGE_MESSAGE)
        self.assertEqual(result.returncode, 1)

    def test_triangle(self):
        command = BASE_COMMAND + ["3.0", "4.0", "5.0"]
        result = run(command)
        self.assertEqual(result.stdout, b"Area = 6.00000\n")
        self.assertEqual(result.returncode, 0)

    def test_second_triangle(self):
        command = BASE_COMMAND + ["3.0", "4.0", "6.0"]
        result = run(command)
        self.assertEqual(result.stdout, b"Area = 5.33268\n")
        self.assertEqual(result.returncode, 0)

    def test_third_triangle(self):
        command = BASE_COMMAND + ["4.0", "13.0", "15.0"]
        result = run(command)
        self.assertEqual(result.stdout, b"Area = 24.00000\n")
        self.assertEqual(result.returncode, 0)

    def test_degenerate_case(self):
        command = BASE_COMMAND + ["3.0", "1.5", "1.5"]
        result = run(command)
        self.assertEqual(result.stdout, b"Area = 0.00000\n")
        self.assertEqual(result.returncode, 0)

    def test_imaginary_case(self):
        command = BASE_COMMAND + ["3.0", "1.0", "1.0"]
        result = run(command)
        self.assertEqual(result.stdout, b"Area = NaN\n")
        self.assertEqual(result.returncode, 0)


if __name__ == "__main__":
    check_for_windows()
    unittest.main()
