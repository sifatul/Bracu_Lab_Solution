class Main:
    print("\n   ######   Lexical Analysis   ######   \n")

    identifier = []
    keywords = []
    logicalOperator = []
    mathOperator = []
    NumericalValue = []
    other = []

# check_keyword() whether the word is a keyword
    def check_keyword(word, keywords):
        if word == "if" or word == "else" or word == "break" or word == "while" \
                or word == "continue" or word == "int" or word == "float" \
                or word == "string" or word == "double" or word == "elif" \
                or word == "import" or word == "global" or word == "class"\
                or word == "in" or word == "as" or word == "except":
            keywords.append(word)
            return True
        else:
            return False

# check_math_operator() whether the word is a math_operator
    def check_math_operator(word, math_operator):
        if word == '+' or word == '-' or word == '=' or word == "/" or word == "*" or word == "%":
            if word not in math_operator:
                math_operator.append(word)
            return True
        else:
            return False

# check_logical_operator() whether the word is a logical_operator
    def check_logical_operator(word, logical_operator):
        if word == ">" or word == "<" or word == ">=" or word == "<=":
            if word not in logical_operator:
                logical_operator.append(word)
            return True
        else:
            return False

# check_numeric_value() whether the word is a numerical value
    def check_numeric_value(word, numerical_value):
        if word.replace(".", "", 1).isdigit():
            numerical_value.append(word)

            return True
        else:
            return False

    file = open('input.txt', 'r')  # Open the file for reading.
    data = file.read()  # Read the contents of the file.
    file.close()  # Close the file since we're done using it.
    my_list = data.splitlines()  # Making array of each sentences.
    for sentence in my_list:
        wordsPerLine = sentence.split()  # Making array of each words from each sentences.
        for word in wordsPerLine:
            if not check_numeric_value(word, NumericalValue) and not check_math_operator(word, mathOperator) \
                    and not check_logical_operator(word, logicalOperator):
                if not check_keyword(word, keywords):
                    alphabets = list(word.strip())      # making array of alphabets from each word ( b; = b, ;)
                    num = ""
                    id = ""
                    for alphabet in alphabets:
                        # checking for numbers,logical,math operator attached to identifier (a=, a+ , b2 etc)
                        if not check_math_operator(alphabet, mathOperator) and not check_logical_operator(alphabet, logicalOperator):
                            if alphabet == "," or alphabet == ";" or alphabet == "{" or alphabet == "}" \
                                    or alphabet == "[" or alphabet == "]" or alphabet == "(" or alphabet == ")":

                                if alphabet not in other:
                                    other.append(alphabet)  # storing the syntax and parenthesis
                            else:
                                if not alphabets[0].replace(".", "", 1).isdigit():
                                    print (id)
                                    id += alphabet  # for more than one alphabet identifier (sum, xyz)
                                elif alphabet.replace(".", "", 1).isdigit() or alphabet == ".":
                                    num += alphabet     # for more than one alphabet numbers (23,1.5, .015 etc)
                    if num != "" and num not in NumericalValue:
                        #print(num)
                        NumericalValue.append(num)
                    if id != "" and id not in identifier:

                        identifier.append(id)

    print("Keywords: ", keywords)
    print("mathOperator: ", mathOperator)
    print("logicalOperator: ", logicalOperator)
    print("NumericalValue: ", NumericalValue)
    print("identifier: ", identifier)
    print("other: ", other)


