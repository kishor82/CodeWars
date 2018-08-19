def spin_words(sentence):
    arr = sentence.split()
    ans = []
    for i in arr:
      if len(i) >= 5:
        ans.append(i[::-1])
      else:
        ans.append(i)
    return ' '.join(ans)