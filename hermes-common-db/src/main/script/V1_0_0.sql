
#创建车旺科技公共平台数据库
CREATE DATABASE IF NOT EXISTS hermes DEFAULT CHARSET utf8 COLLATE utf8_general_ci;

use hermes;

#平台用户表
CREATE TABLE `tb_platform_user` (
  `id` int(12) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `create_date` datetime NOT NULL COMMENT '创建时间',
  `create_user` varchar(32) NOT NULL COMMENT '创建用户',
  `update_date` datetime DEFAULT NULL COMMENT '更新时间',
  `update_user` varchar(32) DEFAULT NULL COMMENT '更新用户',
  `user_id` varchar(40) NOT NULL COMMENT '用户Id',
  `user_name` varchar(40) NOT NULL COMMENT '用户名称',
  `user_phone` varchar(40) NOT NULL COMMENT '用户手机号',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB COMMENT='平台用户表';



#平台管理员角色
CREATE TABLE `tb_admin_role` (
  `id` int(12) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `create_date` datetime NOT NULL COMMENT '创建时间',
  `create_user` varchar(32) NOT NULL COMMENT '创建用户',
  `update_date` datetime DEFAULT NULL COMMENT '更新时间',
  `update_user` varchar(32) DEFAULT NULL COMMENT '更新用户',
  `role_name` varchar(40) NOT NULL COMMENT '用户Id',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB COMMENT='平台用户表';


#平台管理员角色
CREATE TABLE `tb_admin_user_role` (
  `id` int(12) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `create_date` datetime NOT NULL COMMENT '创建时间',
  `create_user` varchar(32) NOT NULL COMMENT '创建用户',
  `update_date` datetime DEFAULT NULL COMMENT '更新时间',
  `update_user` varchar(32) DEFAULT NULL COMMENT '更新用户',
  `role_id` int(12) NOT NULL COMMENT '角色id',
  `user_id` varchar(40) NOT NULL COMMENT '用户ID',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB COMMENT='平台管理员角色';






#平台菜单表
CREATE TABLE `tb_admin_menu` (
  `id` int(12) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `create_date` datetime NOT NULL COMMENT '创建时间',
  `create_user` varchar(32) NOT NULL COMMENT '创建用户',
  `update_date` datetime DEFAULT NULL COMMENT '更新时间',
  `update_user` varchar(32) DEFAULT NULL COMMENT '更新用户',
  `menu_name` varchar(40) NOT NULL COMMENT '菜单、按钮 名称',
  `menu_addr` varchar(500) DEFAULT NULL COMMENT '菜单地址',
  `menu_type` int(1) NOT NULL COMMENT '菜单类型 0 导航菜单，1 按钮事件',
  `menu_pid` varchar(40) NOT NULL COMMENT '上级id',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB COMMENT='平台菜单表';




#平台菜单角色关系表
CREATE TABLE `tb_admin_role_menu` (
  `id` int(12) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `create_date` datetime NOT NULL COMMENT '创建时间',
  `create_user` varchar(32) NOT NULL COMMENT '创建用户',
  `update_date` datetime DEFAULT NULL COMMENT '更新时间',
  `update_user` varchar(32) DEFAULT NULL COMMENT '更新用户',
  `menu_id` int(12) NOT NULL COMMENT '菜单ID',
  `role_id` int(12) NOT NULL COMMENT '角色id',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB COMMENT='平台菜单角色关系表';



#平台菜单资源表
CREATE TABLE `tb_admin_menu_resource` (
  `id` int(12) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `create_date` datetime NOT NULL COMMENT '创建时间',
  `create_user` varchar(32) NOT NULL COMMENT '创建用户',
  `update_date` datetime DEFAULT NULL COMMENT '更新时间',
  `update_user` varchar(32) DEFAULT NULL COMMENT '更新用户',
  `resource_url` varchar(500) NOT NULL COMMENT '资源地址',
  `resource_type` int(1) NOT NULL COMMENT '资源类型 0 URL，1 OSS静态资源',
  `menu_id` int(12) NOT NULL COMMENT '菜单ID',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB COMMENT='平台菜单资源表';



