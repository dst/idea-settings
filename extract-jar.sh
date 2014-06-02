#!/bin/bash

# Extracts jar after exporting form Intellij IDEA
#
# Dariusz Stefański
# 02.06.2014

mv settings.jar settings
cd settings
unzip settings.jar
rm settings.jar
