# This program needs to do:
# read in a file, and delete the unneccesary text ( each letter, capitalized, and the =======)
# put all the words into an array, to be returned into generalBot

def readFile(filename):
    # cases to account for: the capital letters are still being added
    # adding a new line to the end of the file in case the last line doesn't
    # have a \n
    filetext = open(filename, 'r')
    lines = []
    for line in filetext:
        line = line.rstrip()
        print("Line is",line)
        print("Number of chars", len(line))
        print()
        if len(line) > 2:
            if line.find('=') == -1:
                lines.append(line)
    print(lines)
    # filetext.close
    return lines


def writeToFile(file_name, array_of_lines):
    file = open(file_name, 'w+')
    for word in array_of_lines:
        # print(word)
        # print(type(word))
        file.write(word+'\\n')

def main():
    # file = "negativeWords_copy.txt"
    file = "test.txt"
    lines_array = readFile(file);
    writeToFile(file, lines_array)

main()
