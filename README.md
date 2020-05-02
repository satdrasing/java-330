
#### original source code execution using java (not .class file)
```
java HelloWorld.java

JEP 330: single file source code
total 20
drwx------  2 root     root     16384 Apr 23 22:22 lost+found
drwxr-xr-x 32 satendra satendra  4096 May  1 14:55 satendra
```


#### remaned the "HelloWorld to helloworld" execution using java, the  --source option  is linking to class files

```
java --source 11 helloworld.java

JEP 330: single file source code
total 20
drwx------  2 root     root     16384 Apr 23 22:22 lost+found
drwxr-xr-x 32 satendra satendra  4096 May  1 14:55 satendra

```


#### use sha-bang((#!/usr/bin/java --source 11)) to link class and removed extention for simplicity 
```
./helloworld
JEP 330: single file source code
total 20
drwx------  2 root     root     16384 Apr 23 22:22 lost+found
drwxr-xr-x 32 satendra satendra  4096 May  1 14:55 satendra

```