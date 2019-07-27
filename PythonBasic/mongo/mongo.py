#Author wangheng


#!/usr/bin/env python
# -*- coding:utf-8 -*-

from pymongo import MongoClient

conn = MongoClient('192.168.0.130', 27017)
db = conn.mydb  #连接mydb数据库，没有则自动创建
my_set = db.test_set　　#使用test_set集合，没有则自动创建
