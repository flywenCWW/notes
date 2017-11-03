-----------------------
Jvm-命令				|
-----------------------
	jps
		* 显示出所有的JAVA进程以及PID
		* 参数
			-l			//输出完全的包名，应用主类名，jar的完全路径名 
			-v			//显示出jvm参数
			-m			//显示出传递给main函数的参数

	jstat
		* 一个极强的监视VM内存工具。可以用来监视VM内存内的各种堆和非堆的大小及其内存使用量。
		* 使用
			jstat [参数] [pid] [interval] [count]
			
			参数		//必须值
			pid			//JAVA线程的PID
			interval	//隔多少毫秒刷新一次
			count		//一共刷新多少次,不写就死循环
			
		* 参数
			-gcutil		
	
		