string = input("Enter a string: ")
words=string.split()
for word in words:
    word=word.strip(".,#,@,*")
    print(f'{word}:{len(word)}')
