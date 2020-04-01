修复优化部分问题
* 修复svnstat启动时版本比较报错问题

>Subversion binary is incorrect version. Found: 1.13.0, required: 1.3.0 Updating

* 修复diff版本判断出错，使用旧diff的问题
* 修复URLDecoder中解析path时，包含特殊字符"%"&"+"会异常退出的问题


>java.lang.IllegalArgumentException: URLDecoder: Illegal hex characters in escape (%) pattern

* 使用Pattern预编译regex优化字符串匹配和替换过程
* 默认扩大了部分线程池大小

** 推荐使用 -svnkit 选项，使用java的客户端进行svn操作，避免反复启动process **




StatSVN
------------
StatSVN is a statistics tool for SVN repositories. It generates HTML reports from SVN log files.

#### The StatSVN Manual
The StatSVN manual is located here: http://svn.statsvn.org/statsvnwiki/index.php/UserManual

#### Quick Start
1. Download the latest release from [here](https://github.com/Revenge282/StatSVN/releases/latest "here").
2. Expand the zip file into some directory, e.g C:\statsvn
3. Check out a working copy of the desired SVN module into some directory, e.g. C:\myproject.
4. Change into that directory and type `svn log --xml -v > svn.log`
5. Change back to the c:\statsvn directory
6. Type `java -jar statsvn.jar C:\myproject\svn.log C:\myproject`
7. Open C:\statsvn\index.html in your web browser

You can tweak the output of StatSVN in various ways. Run `java -jar statsvn.jar` for an overview of the command line parameters, and check the manual for full information.