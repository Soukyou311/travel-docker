#!/bin/bash
if pgrep -f "java -jar /home/ec2-user/target/newbee-mall-1.0.0-SNAPSHOT.jar" > /dev/null; then
  echo "Java process is running. Stopping..."
  pkill -f "java -jar /home/ec2-user/target/newbee-mall-1.0.0-SNAPSHOT.jar"
else
  echo "Java process is not running. Skipping..."
fi