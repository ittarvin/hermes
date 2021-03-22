
#创建车旺科技公共平台数据库
CREATE DATABASE IF NOT EXISTS hermes DEFAULT CHARSET utf8 COLLATE utf8_general_ci;

use hermes;


#平台客户信息表
CREATE TABLE `tb_platform_client` (
  `id` int(12) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `create_date` datetime NOT NULL COMMENT '创建时间',
  `create_user` varchar(32) NOT NULL COMMENT '创建用户',
  `update_date` datetime DEFAULT NULL COMMENT '更新时间',
  `update_user` varchar(32) DEFAULT NULL COMMENT '更新用户',
  `client_name` varchar(40) NOT NULL COMMENT '客户名称',
  `client_phone` varchar(20) NOT NULL COMMENT '手机号',
  `user_id` varchar(40) NOT NULL COMMENT '用户userId',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB COMMENT='平台客户信息表';


#平台频道信息表
CREATE TABLE `tb_platform_channel` (
  `id` int(12) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `create_date` datetime NOT NULL COMMENT '创建时间',
  `create_user` varchar(32) NOT NULL COMMENT '创建用户',
  `update_date` datetime DEFAULT NULL COMMENT '更新时间',
  `update_user` varchar(32) DEFAULT NULL COMMENT '更新用户',
  `channel_name` varchar(40) NOT NULL COMMENT '频道名称',
  `channel_status` int(1) NOT NULL COMMENT '频道状态：0 启用，1 未启用',
  `channel_sort` int(2) NOT NULL COMMENT '频道排序',
  `channel_page_addr` varchar(500) NOT NULL COMMENT '频道页面地址',
  `channel_data_addr` varchar(500) NOT NULL COMMENT '频道数据同步地址',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB COMMENT='平台频道信息表';



#平台频道信息与客户关系表
CREATE TABLE `tb_platform_client_channel` (
  `id` int(12) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `create_date` datetime NOT NULL COMMENT '创建时间',
  `create_user` varchar(32) NOT NULL COMMENT '创建用户',
  `update_date` datetime DEFAULT NULL COMMENT '更新时间',
  `update_user` varchar(32) DEFAULT NULL COMMENT '更新用户',
  `channel_id` int(12) NOT NULL COMMENT '频道Id',
  `user_id` varchar(40) NOT NULL COMMENT '用户Id',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB COMMENT='平台频道信息与客户关系表';


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
  `menu_name` varchar(40) NOT NULL COMMENT '菜单名称',
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



