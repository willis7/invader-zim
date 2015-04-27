#!/usr/bin/env bash

ECHO "seeding the database"
mongo invasion /opt/zim/quote.js

# Start the Zim Service
java -jar /opt/zim/invader-zim.jar
