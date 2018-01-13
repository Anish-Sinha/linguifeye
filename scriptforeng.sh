#!/bin/bash

gst-launch-1.0 v4l2src num-buffers=1 ! jpegenc ! filesink location=./t.jpg 
#location=/home/linaro/Desktop/hardhack2018/t.jpg 
python3 cloudvisreq.py AIzaSyBuzBBMSTi5IcxnnDBelCGshobIYGBP3vk t.jpg > a.txt
echo "Original Text"
cat a.txt
python3 translate_fe.py
