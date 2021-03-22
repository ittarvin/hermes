#!/bin/bash
baseDirForScriptSelf=$(cd "$(dirname "$0")"; pwd)
JAVA_HOME=/opt/web_app/jdk1.8
HSBXJJ_PUBLIC_LIB_DIR=/opt/web_app/middleman/middleman_lib
sh ${baseDirForScriptSelf}/run.sh start prod 2g
