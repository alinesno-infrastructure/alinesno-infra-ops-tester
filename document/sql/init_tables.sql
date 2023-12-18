-- 用户信息表（UserInfo）
CREATE TABLE UserInfo (
    id INT PRIMARY KEY AUTO_INCREMENT COMMENT '用户唯一标识符',
    name VARCHAR(50) NOT NULL COMMENT '用户姓名',
    email VARCHAR(100) NOT NULL COMMENT '用户邮箱地址',
    other_info VARCHAR(255) DEFAULT NULL COMMENT '其他用户信息（如职位、部门等）'
) COMMENT='用户信息表';

-- 邮件表（Email）
CREATE TABLE Email (
    id INT PRIMARY KEY AUTO_INCREMENT COMMENT '邮件唯一标识符',
    sender_id INT NOT NULL COMMENT '邮件发送者的用户id',
    recipient_id INT NOT NULL COMMENT '邮件接收者的用户id（可以是多个）',
    subject VARCHAR(100) DEFAULT NULL COMMENT '邮件主题',
    content TEXT DEFAULT NULL COMMENT '邮件正文内容',
    attachments VARCHAR(255) DEFAULT NULL COMMENT '邮件附件（可以是多个）',
    send_time DATETIME NOT NULL COMMENT '邮件发送的时间戳',
    status VARCHAR(20) DEFAULT NULL COMMENT '邮件状态（如已读、未读、已回复等）'
) COMMENT='邮件表';

-- 文件表（File）
CREATE TABLE File (
    id INT PRIMARY KEY AUTO_INCREMENT COMMENT '文件唯一标识符',
    file_name VARCHAR(100) NOT NULL COMMENT '文件的名称',
    storage_path VARCHAR(200) NOT NULL COMMENT '文件在服务器上的存储路径',
    size INT DEFAULT NULL COMMENT '文件大小',
    type VARCHAR(50) DEFAULT NULL COMMENT '文件类型（如文档、图片、压缩文件等）'
) COMMENT='文件表';

-- 文件夹表（Folder）
CREATE TABLE Folder (
    id INT PRIMARY KEY AUTO_INCREMENT COMMENT '文件夹唯一标识符',
    user_id INT NOT NULL COMMENT '文件夹所属用户的id',
    name VARCHAR(50) NOT NULL COMMENT '文件夹名称',
    parent_folder_id INT DEFAULT NULL COMMENT '父文件夹的id（顶级文件夹的父文件夹id为空）',
    create_time DATETIME NOT NULL COMMENT '文件夹创建的时间戳'
) COMMENT='文件夹表';

-- 标签表（Label）
CREATE TABLE Label (
    id INT PRIMARY KEY AUTO_INCREMENT COMMENT '标签唯一标识符',
    user_id INT NOT NULL COMMENT '标签所属用户的id',
    name VARCHAR(50) NOT NULL COMMENT '标签名称'
) COMMENT='标签表';

-- 用户-邮件关系表（UserEmailRelation）
CREATE TABLE UserEmailRelation (
    user_id INT NOT NULL COMMENT '用户的id',
    email_id INT NOT NULL COMMENT '邮件的id',
    type VARCHAR(20) DEFAULT NULL COMMENT '关系类型（如发件人、收件人、抄送人等）',
    PRIMARY KEY (user_id, email_id)
) COMMENT='用户-邮件关系表';

-- 用户-文件夹关系表（UserFolderRelation）
CREATE TABLE UserFolderRelation (
    user_id INT NOT NULL COMMENT '用户的id',
    folder_id INT NOT NULL COMMENT '文件夹的id',
    PRIMARY KEY (user_id, folder_id)
) COMMENT='用户-文件夹关系表';

-- 用户-标签关系表（UserLabelRelation）
CREATE TABLE UserLabelRelation (
    user_id INT NOT NULL COMMENT '用户的id',
    label_id INT NOT NULL COMMENT '标签的id',
    PRIMARY KEY (user_id, label_id)
) COMMENT='用户-标签关系表';
