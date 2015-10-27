@echo off
echo user root> ftpcmd.dat
echo Pom11March1987>> ftpcmd.dat
echo cd root>> ftpcmd.dat
echo pwd>> ftpcmd.dat
echo bin>> ftpcmd.dat
echo put %1>> ftpcmd.dat
echo quit>> ftpcmd.dat
ftp -n -s:ftpcmd.dat 63.142.252.198
del ftpcmd.dat