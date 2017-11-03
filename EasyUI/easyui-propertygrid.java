----------------------------
Easyui-propertygrid			|
----------------------------
	# 属性表格提供The propertygrid provide给用户浏览和编辑对象属性的一个接口。属性表格是一个行内可编辑数据表格。它使用起来相当简单。用户可以非常简单的创建一个分层的可编辑属性列表和表示任何数据类型的项。属性表格内建排序和分组功能。
	# 继承关系
		datagrid

----------------------------
Easyui-propertygrid属性		|
----------------------------
	'属性表格的属性扩展自datagrid(数据表格)，属性表格新增的的属性如下：'
	showGroup
		* 定义是否显示属性分组。
	
	groupField
		* 定义分组的字段名。
	
	groupFormatter
		* 定义如何格式化分组的值。该函数拥有如下参数：
			group	//分组字段值。
			rows	//属于该分组的所有行。

----------------------------
Easyui-propertygrid事件		|
----------------------------
	
----------------------------
Easyui-propertygrid方法		|
----------------------------
	'属性表格的方法扩展自datagrid(数据表格)，属性表格新增的方法如下：'
	groups
		* 返回所有分组。每一组包含如下属性。（该方法自1.4.4版开始可用）
			value		//分组的字段值。
			rows		//属于该分组的行。
			startIndex	//当前行相对于所有行的索引。
	
	expandGroup
		* 展开指定分组。如果'groupIndex'参数未指定，则展开所有分组。
	
	collapseGroup
		* 折叠指定分组。如果'groupIndex'参数未指定，则折叠所有分组。 


	