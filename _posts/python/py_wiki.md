---
layout: page
title: Py Wiki
category: python
tags: [python], [wiki]
---


<div class="message">
  Howdy! This is an example blog post that shows several types of HTML content supported in this theme.
</div>

Python을 활용하면서 자주 썼던 모듈이나 사용법을 위키로 정리해봅니다.

Using Python, I would like to summarize the modules and usages I used frequently with the wiki.


## List function

소개

- len(ar) 
  - 인덱스의 개수 즉, 리스트 길이를 구하는 함수.
  - `ar = []`
  - `len(ar) # 리스트의 내용이 없으므로 0 출력`
  - `len( [1, 2, 3] ) #자료 개수가 세 개의 이므로 3 출력`

- append(x)
  - 자료 x를 리스트의 맨 뒤에 추가해주는 함수.
  - `ar = ['가', '나', '다']`
  - `ar.append('라')`
  - `ar #['가', '나', '다', '라']로 출력`
  - 리스트1에 리스트2를 append 할 수 있다. 
  - `lis = []`
  - `li.input().split()`
  - `lis.append(li)`

- pop(i)
  - i번 위치에 있는 인덱스를 리스트에서 pop 시키고(= 빼내기) 그 값을 함수의 결괏값으로 반환.
  - `stack = [2, 1, 7]`
  - `stack.pop(2) # 7 출력, stack = [2, 1]`


