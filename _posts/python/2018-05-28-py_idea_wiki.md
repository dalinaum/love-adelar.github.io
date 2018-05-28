---
layout: page
title: Py Idea Wiki
category: python
tags: [python], [wiki]
---

Python3 을 활용하면서 알게된 개념을 위키로 정리해봅니다.

Using Python3, I would like to summarize the notions I learned today with the wiki.

---

## Sequence type
* 문자열 (str), 유니코드 (unicode), 리스트 (list), 튜플 (tuple), 버퍼(buffer), xrange가 python의 자료형.
* 시퀀스 자료형에 포함된 각 객체는 index로 참조시킬 수 있다.
* 각 객체는 순서를 가진다.
* Python의 Sequence type에 관한 자료 : https://docs.python.org/3/library/stdtypes.html#sequence-types-list-tuple-range .

### (1) Common Sequence Operations

`in`과 `not in` 연산자는 비교 연산자와 같은 속성을 가진다.
`+` 더하기와 `*` 곱하기 연산자는 수치 연산과 같은 우선순위를 가진다.

<table>
  <thead>
    <tr>
      <th>연산</th>
      <th>결괏값</th>
      <th>Notes</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>x in S</td>
      <td>s의 아이템이 x와 같다면 True, 그렇지 않으면 False</td>
      <td>(1)</td>
    </tr>
    <tr>
      <td>S + t</td>
      <td>s와 t 더하기</td>
      <td>(6)(7)</td>
    </tr>
    <tr>
      <td>S * n or n * S</td>
      <td>s를 n번 동안 더하기</td>
      <td>(2)(7)</td>
    </tr>
    <tr>
      <td>S[i]</td>
      <td></td>
      <td>(3)</td>
    </tr>
    <tr>
      <td>S[i:j]</td>
      <td></td>
      <td>(3)(4)</td>
    </tr>
    <tr>
      <td>S[i:j:k]</td>
      <td></td>
      <td>(3)(5)</td>
    </tr>
    <tr>
      <td>len(S)</td>
      <td></td>
      <td>s 아이템 개수 구하기</td>
    </tr>
    <tr>
      <td>min(S)</td>
      <td></td>
      <td>s의 아이템 중 가장 작은 값템 구하기</td>
    </tr>
    <tr>
      <td>max(S)</td>
      <td>s의 아이템 중 가장 큰 값 구하기</td>
      <td></td>
    </tr>
    <tr>
      <td>S.index(x[, i[, j]])</td>
      <td>s 내에 있는 x의 최초 출현 인덱스 구하기</td>
      <td>(8)</td>
    </tr>
    <tr>
      <td>S.count(x)</td>
      <td>S에서 x 가 일어날 수 있는 전체 횟수 구하기</td>
      <td></td>
    </tr>
  </tbody>
</table>

Notes: 
1. t는 교체 할 슬라이스와 길이가 같아야 한다.
2. 선택적 인수 i는 기본적으로 -1이므로 기본적으로 마지막 항목이 제거되어 반환한다.
3. x에서 s가 발견되지 않으면 remove는 ValueError를 발생시킨다.
4. `reverse ()` 메서드는 큰 시퀀스를 뒤집을 때 공간 절약을 위해 시퀀스를 수정한다. 
부작용으로 작동한다는 것을 사용자에게 알리기 위해 역순으로 반환하지 않는다.
5. 슬라이싱 연산을 지원하지 않는 변경 가능한 컨테이너 (예 : dict 및 set)의 인터페이스와의 일관성을 위해 `clear ()` 및 `copy ()`가 포함된다.
6. 버전 3.3의 새로운 기능 : `clear ()` 및 `copy ()` 메소드.
7. n 값은 정수이거나 `__index __ ()`를 구현하는 객체. 
n의 0과 음수 값은 시퀀스를 지 웁니다. 시퀀스의 항목은 복사되지 않는다. 
공통 순서 조작에서 s * n에 대해 설명한대로 여러 번 참조된다.

### (2) String
* String은 메서드와 함께 모든 일반적인 시퀀스 작업을 구현한다.
* '' 나 ""로 묶어 표시한다.

### (3) List
* List는 변경 가능한 시퀀스로, 일반적으로 균질 항목의 모음을 저장하는 데 사용된다.
* (정확한 유사도는 응용 프로그램마다 다를 수 있음).
* []로 묶어 표시한다.

### (4) Tuple
* Tuple은 일반적으로 이질적인 데이터 집합 (예 : 내장된 enumerate ()에 의해 생성 된 2 튜플)을 저장하는 데 사용되며, 변경 불가능한 시퀀스다.
* 튜플은 균질 데이터의 순서가 바뀔 수 없는 경우에도 사용된다. (예 : 집합 또는 사전 인스턴스에 저장을 허용하는 경우).
* ()로 묶어 표시한다.

### (5) Range
* Range type은 숫자의 불변의 순서를 나타내며 for 루프에서 특정 횟수의 반복에 일반적으로 사용된다.
