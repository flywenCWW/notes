-----------------------------
Linux-文件系统管理			 |
-----------------------------

-----------------------------
Linux-回顾系统分区和文件系统|
-----------------------------
	1,分区类型
		# 主分区	:一共最多只能分四个
		# 扩展分区	:只能有一个,算主分区的一种.扩展分区不能装数据和格式化,唯一的作用就是在里面分逻辑分区
		# 逻辑分区	:逻辑分区是在扩展分区中划分的
			> IDE硬盘	:最多支持59个逻辑分区
			> SCSI硬盘	:最多支持11个逻辑分区
	2,分区的设备文件名
		主分区1			/dev/sda1
		主分区2			/dev/sda2
		主分区3			/dev/sda3
		扩展分区		/dev/sda4
			逻辑分区1		/dev/sda5
			逻辑分区2		/dev/sda6
			逻辑分区3		/dev/sda7
		
		# sda1 -  sda4 只能给主分区和扩展分区使用,不能给逻辑分区
		# 说白了,任何时候,逻辑分区的文件名都是:sda5开始

-----------------------------
Linux-文件系统命令			 |
-----------------------------
	# 统计文件系统的占用情况
		df [选项] [挂载点]
			# 选项
			-a:			//显示所有文件系统信息,包括特殊文件系统.如:/proc,/sysfs
			-h:			//使用习惯单位显示容量:KB,MB,GB
			-T:			//显示文件系统类型
			-m:			//以MB为单位显示容量
			-k:			//以KB为单位显示容量,默认的就是以KB为单位

			文件系统		容量  已用 可用 已用 挂载点
			Filesystem      Size  Used Avail Use% Mounted on
			-----------------------------------------------
			/dev/sda2        18G  2.6G   15G  16% /
			tmpfs           491M   72K  491M   1% /dev/shm
			/dev/sda1       291M   34M  242M  13% /boot

	# 统计目录/文件大小
		du [选项] [文件/目录]
		# 选项 
			-a:			//显示每个文件的磁盘占用量,默认只统计目录的磁盘占用量
			-h:			//使用习惯单位显示容量:KB,MB,GB
			-s:			//统计总占用量,而不列出目录和子文件的占用量
	
	# 文件系统修复
		fsck [选项] [分区设备文件名]
		# 选项
			-a:			//不显示用户提示,自动修复文件系统
			-y:			//自动修复,跟-a一个德行,不过有些文件系统只支持-y
		
		# 尽量别整这些
	
	# 显示磁盘状态
		dump2fs [分区设备文件名]

-----------------------------
Linux-挂载命令				 |
-----------------------------
	# 查询系统中已经挂着的设备
		mount -l			//-l会显示卷标名称
		mount -a			//根据配置文件/etc/fstab的内容,自动挂着
	
	# 挂载设备
		mount [-t 文件系统] [-L 卷标名] [-o 特殊选项] [设备文件名] [挂载点]
		# 选项
			-t:			//文件系统,加入文件系统类型来指定挂载的类型,可以以:ext3,ext4,iso9660等文件系统
			-L:			//挂着指定卷标的分区,而不是安装设备文件挂载名
			-o:			//特殊选项,可以指定挂载的额外选项
		# mount [设备文件名] [挂载点]
			* 直接就干过去了,使用默认值
			
	# 挂载光盘
		1,简建立挂载点
			mkdir /mnt/cdrom
		2,挂着光盘
			mount /dev/cdrom /mnt/cdrom
	# 挂着U盘
		* 其实就是要注意的就是U盘的文件系统,Linux不支持NTFS文件系统
		* '如果要支持NTFS分区,需要进行一些操作'

	# 卸载
		umount [设备文件名/挂载点]
		* 有点像Windows的弹出U盘

-----------------------------
Linux-fdisk分区				 |
-----------------------------
	... ...
-----------------------------
Linux-/etc/fstab文件修复	 |
-----------------------------
	... ...
-----------------------------
Linux-分配swap分区			 |
-----------------------------
	... ...
	
	
	
	