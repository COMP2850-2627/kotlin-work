# Task 1.4

Small example of a Gradle-based Kotlin project. Compare this with the
Kotlin Toolchain project in Task 1.3.1.

To run the application, building it first if necessary, do

    ./gradlew run

To create a distributable version of the application, do

    ./gradlew distZip

To remove all built artifacts, do

    ./gradlew clean

## Notes

The above instructions assume the use of Linux/macOS. On Windows, invoke
Gradle using `.\gradlew.bat` instead of `./gradlew`.

On a Linux or macOS system, you might see a 'Permission denied' error when
you attempt to run Gradle. If so, fix the script's permissions with

    chmod u+x gradlew
