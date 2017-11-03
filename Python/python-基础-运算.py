----------------------------
python-赋值运算				|
----------------------------
	=	简单的赋值运算符	c = a + b 将 a + b 的运算结果赋值为 c
	+=	加法赋值运算符		c += a 等效于 c = c + a
	-=	减法赋值运算符		c -= a 等效于 c = c - a
	*=	乘法赋值运算符		c *= a 等效于 c = c * a
	/=	除法赋值运算符		c /= a 等效于 c = c / a
	%=	取模赋值运算符		c %= a 等效于 c = c % a
	**=	幂赋值运算符		c **= a 等效于 c = c ** a
	//=	取整除赋值运算符	c //= a 等效于 c = c // a
	+	不做任何操作		+x		
	
	a,b = (1,2)
		* 把元组的每个元素,依次赋值给左边的每个变量
		* 变量个数与元组长度要一致,不然异常

	a,b = [1,2]
		* 把元组的每个元素,依次赋值给左边的每个变量
		* 变量个数与元组长度要一致,不然异常

	!= 
		* 不等于运算
	<>
		* 在python2中也表示不等于,但是很不专业,不建议使用

----------------------------
Python-比较运算符			|
----------------------------
	==	等于		比较对象是否相等	(a == b) 返回 False。
	!=	不等于		比较两个对象是否不相等	(a != b) 返回 True.
	>	大于		返回x是否大于y	(a > b) 返回 False。
	<	小于		返回x是否小于y。所有比较运算符返回1表示真，返回0表示假。这分别与特殊的变量True和False等价。注意，这些变量名的大写。	(a < b) 返回 True。
	>=	大于等于	返回x是否大于等于y。	(a >= b) 返回 False。
	<=	小于等于	返回x是否小于等于y。	(a <= b) 返回 True。

	# 一个值,一次性可以进行多个比较
		a = 9
		0 <= a <= 10		//TRUE

----------------------------
Python-三目运算符			|
----------------------------
	[True 值] if [boolean 表达式] else [False 值]

----------------------------
python-算术运算				|
----------------------------
	5  +  6
		# 相加

	5  -  6
		# 相减

	5  /  6
		# 相除,会保留一定的小数点

	5  // 6
		# 地板除法
		# 相除,会去掉小数点(非四舍五入)

	5  *  6
		# 相乘

	5  ** 6		
		# 乘方
		# 5 个 6 相乘
	
	# 除法计算结果是浮点数,即使是两个整数恰好整除,结果也是浮点数
	# 乘法运算的时候,只要有一个是浮点数,就算结果是整数,也会被转换为浮点数

----------------------------
Python-位运算符				|
----------------------------
	# 跟JAVA差不多


----------------------------
Python-成员运算符			|
----------------------------
	in	
		* 如果在指定的序列中找到值返回 True，否则返回 False。
		* x 在 y 序列中 , 如果 x 在 y 序列中返回 True。
		* 可以操作字符串,列表等数据类型

	not in	
		* 如果在指定的序列中没有找到值返回 True，否则返回 False。	
		* x 不在 y 序列中 , 如果 x 不在 y 序列中返回 True。
	
----------------------------
Python身份运算符			|
----------------------------
	is	
		* is是判断两个标识符是不是引用自一个对象	
		* x is y, 如果 id(x) 等于 id(y) , is 返回结果 1

	is not	
		* is not是判断两个标识符是不是引用自不同对象	
		* x is not y, 如果 id(x) 不等于 id(y). is not 返回结果 1
	
	# 判断对象引用的地址是否相等
	# 根据 id() 方法返回值进行比较


