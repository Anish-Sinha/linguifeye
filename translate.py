from gtts import gTTS
import os
from googletrans import Translator

file_object=open("a.txt","r+")

translator=Translator()

translations=translator.translate(file_object.read(), dest='en')

print ("***Translate File: ")
print (translations.text)

tts_2 = gTTS(text = file_object.read(), lang = 'en')
tts_2.save("aud2.mp3")
os.system("mpg321 aud.mp3")
tts = gTTS(text = translations.text, lang = 'en')
tts.save("aud.mp3")
os.system("mpg321 aud.mp3")
