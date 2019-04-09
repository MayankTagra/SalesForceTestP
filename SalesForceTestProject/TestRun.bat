set projectPath=C:\Users\mtagra\git\repository4\SalesForceTestProject
cd\
cd %projectPath%
set classPath=%projectPath%\bin;%projectPath%\lib\*;
java org.testng.TestNG %projectPath%\lib\testng1.xml
pause
