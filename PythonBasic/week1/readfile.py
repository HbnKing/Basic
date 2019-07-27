
spark = SparkSession \
    .builder \
    .appName("myApp") \
    .config("spark.mongodb.input.uri", "mongodb://127.0.0.1:37000/test.coll") \
    .config("spark.mongodb.output.uri", "mongodb://127.0.0.1:37000/test.coll") \
    .getOrCreate()


people = spark.createDataFrame([("Dwalin", 169), ("Oin", 167), ("Gloin", 158), ("Fili", 82)], ["name", "age"])


people.write.format("com.mongodb.spark.sql.DefaultSource").mode("append").save()