-----------------------------
Linux-安全系列				 |
-----------------------------


-----------------------------
Linux-修改SSH端口			 |
-----------------------------
	1,修改配置文件：/etc/ssh/sshd_config 
		* 找到:post 22
	2,先将Port 22 前面的 # 号去掉，并另起一行。如定义SSH端口号为26611 ，则输入:port 26611
		* 同时监听俩端口,万一指定的端口挂了,22还能用!留个活路嘛
	3,重启SSH服务:service sshd restart
	4,使用新端口可以访问后,再进去把:port 22 这行业干掉就OK

