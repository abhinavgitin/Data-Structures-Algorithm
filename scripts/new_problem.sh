#!/bin/bash

# Usage: ./new_problem.sh "<Problem Name>" <Language>
# Example: ./new_problem.sh "Add Element" java

PROBLEM_NAME=$1
LANG=$2

# Replace spaces with underscores for folder and file names
BASE_NAME=$(echo "$PROBLEM_NAME" | tr ' ' '_')

# Folder name = Problem name only (no date)
FOLDER_NAME="${BASE_NAME}"

# Path to problems directory (relative to this script)
PROBLEMS_DIR="../problems"

# Create the folder
mkdir -p "$PROBLEMS_DIR/$FOLDER_NAME"

# Copy the markdown template
cp ../templates/solutions_template.md "$PROBLEMS_DIR/$FOLDER_NAME/Solution.md"

# Create an empty code file based on language
case $LANG in
  java)
    touch "$PROBLEMS_DIR/$FOLDER_NAME/$BASE_NAME.java"
    ;;
  cpp)
    touch "$PROBLEMS_DIR/$FOLDER_NAME/$BASE_NAME.cpp"
    ;;
  py)
    touch "$PROBLEMS_DIR/$FOLDER_NAME/$BASE_NAME.py"
    ;;
  js)
    touch "$PROBLEMS_DIR/$FOLDER_NAME/$BASE_NAME.js"
    ;;
  *)
    echo "Language not supported. Creating a .txt file instead."
    touch "$PROBLEMS_DIR/$FOLDER_NAME/$BASE_NAME.txt"
    ;;
esac

echo "✅ Folder and files created successfully:"
echo "📁 $PROBLEMS_DIR/$FOLDER_NAME"
echo "├── $(basename "$PROBLEMS_DIR/$FOLDER_NAME/$BASE_NAME.$LANG")"
echo "└── Solution.md"
