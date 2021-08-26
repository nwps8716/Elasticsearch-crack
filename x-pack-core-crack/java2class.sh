#!/bin/sh

ES_HOME="./elasticsearch-workdir" # 指定Elasticsearch的目录
ES_JAR=$(cd $ES_HOME && ls lib/elasticsearch-7.13.4.jar)
ESCORE_JAR=$(cd $ES_HOME && ls lib/elasticsearch-core-7.13.4.jar)
LUCENE_JAR=$(cd $ES_HOME && ls lib/lucene-core-8.8.2.jar)
XPACK_JAR=$(cd $ES_HOME && ls modules/x-pack-core/x-pack-core-7.13.4.jar)

javac -cp "${ES_HOME}/${ES_JAR}:${ES_HOME}/${LUCENE_JAR}:${ES_HOME}/${XPACK_JAR}:${ES_HOME}/${ESCORE_JAR}" LicenseVerifier.java

javac -cp "${ES_HOME}/${ES_JAR}:${ES_HOME}/${LUCENE_JAR}:${ES_HOME}/${XPACK_JAR}:${ES_HOME}/${ESCORE_JAR}" XPackBuild.java
