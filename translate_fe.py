from gtts import gTTS
import os
import time
from googletrans import Translator

file_object=open("a.txt","r+")

translator=Translator()

textVal = file_object.read()

langs=translator.detect(textVal)

translations=translator.translate(textVal, dest='en')

print ("***Translate File: ")
print (translations.text)

tts_2 = gTTS(text = textVal, lang =langs.lang)
tts_2.save("aud2.mp3")

tts = gTTS(text = translations.text, lang = 'en')
tts.save("aud.mp3")

#Original foreign language speech
os.system("mpg321 aud2.mp3")
time.sleep(1)

#Translated English speech
os.system("mpg321 aud.mp3")
