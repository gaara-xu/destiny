#!/usr/bin/env bash
context=$1;
echo 'start ... ';
git pull origin Destiny;
git add .
git commit -m "commit by: $context"
git push origin Destiny
