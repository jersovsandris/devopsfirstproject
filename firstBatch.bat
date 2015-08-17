@ECHO OFF

setlocal

if "%JAVA_HOME%" == "" ( set JAVA_HOME=C:\Program Files\Java\jdk1.8.0_51)
set PATH = %JAVA_HOME%\bin:%PATH%

if "%ANT_HOME%" == "" (set M2_HOME=C:\apache-maven-3.3.3)
set PATH=%ANT_HOME%\bin;%PATH%

ant report
