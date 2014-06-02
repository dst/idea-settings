#!/bin/bash

# Prepares zip archive for importing in Intellij IDEA.
#
# Dariusz Stefański
# 02.06.2014

cd settings
zip -r settings.zip *
mv settings.zip ../
