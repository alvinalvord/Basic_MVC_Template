@echo off

REM batch file to compile and run a JavaFX application
REM Note: add all necessary subdirectories for compilation as needed

REM @author: Pillejera, Jasper Glen A.
REM last modified: Oct. 28, 2018

echo -- Building project --

REM build from scratch
REM remove old binary files
if exist "bin" rd /s /q "bin"
if not exist "bin" md "bin"

REM copy resource files
if not exist "bin/res" xcopy /s /e /i /y "res" "bin/res"

REM copy io files
if not exist "bin/io" xcopy /s /e /i /y "io" "bin/io"

REM compile all java files under source
javac -d bin -Xlint:all -Xdiags:verbose ^
src/model/beans/*.java ^
src/model/*.java ^
src/controller/*.java ^
src/view/*.java ^
src/*.java

REM execute Driver class
cd bin
java Driver
cd ..
