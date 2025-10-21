#!/bin/bash

# Usage: ./new_problem.sh <Date> "<Problem Name>" <Language>
# Example: ./new_problem.sh 2025-10-22 "Reverse Linked List" java

DATE=$1
PROBLEM_NAME=$2
LANG=$3

# Replace spaces with underscores for folder name
FOLDER_NAME="${DATE}_$(echo $PROBLEM_NAME | tr ' ' '_')"

# Path to problems folder
PROBLEMS_DIR="../problems"

# Create the folder
mkdir -p "$PROBLEMS_DIR/$FOLDER_NAME"

# Copy the markdown template
cp ../templates/solutions_template.md "$PROBLEMS_DIR/$FOLDER_NAME/Solution.md"

# Create an empty code file based on language
case $LANG in
  java)
    touch "$PROBLEMS_DIR/$FOLDER_NAME/$FOLDER_NAME.java"
    ;;
  cpp)
    touch "$PROBLEMS_DIR/$FOLDER_NAME/$FOLDER_NAME.cpp"
    ;;
  py)
    touch "$PROBLEMS_DIR/$FOLDER_NAME/$FOLDER_NAME.py"
    ;;
  js)
    touch "$PROBLEMS_DIR/$FOLDER_NAME/$FOLDER_NAME.js"
    ;;
  *)
    echo "Language not supported. Creating a .txt file instead."
    touch "$PROBLEMS_DIR/$FOLDER_NAME/$FOLDER_NAME.txt"
    ;;
esac

echo "Folder and template created at $PROBLEMS_DIR/$FOLDER_NAME"
