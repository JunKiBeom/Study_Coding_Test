# [level 1] 주행거리 비교하기 - 6253

[문제 링크](https://softeer.ai/practice/6253) 

### 성능 요약

메모리: 11.98 MB, 시간: 118 ms

### 구분

HOME > Challenge > 연습문제

### 채점결과

정확성: 100.0<br/>합계: 100.0 / 100.0

### 제출 일자

2024년 06월 29일 01:46:15

### 문제 설명

<div class="ide-prompt__desc"><p class="qti-paragraph" dir="ltr"><span>현대자동차그룹의 연구원인 영호는 자동차의 주행거리를 비교하는 프로그램을 만들고 있다.</span></p><p class="qti-paragraph" dir="ltr"></p><p class="qti-paragraph" dir="ltr"><span>두 차량 A와 B의 주행거리가 자연수로 주어졌을 때, 주행거리를 비교해서 어느 차량의 주행거리가 더 큰지 알아보자.</span></p></div>


<div class="ide-example__input"><div class="ide-prompt__title"><h5><strong>제약조건</strong></div><div class="ide-prompt"><p class="ide-prompt__desc"><p class="qti-paragraph" dir="ltr"><span>0 ≤ A,B ≤ 100,000</span></p></p></div></div>

<hr>

<div class="ide-example__input"><div class="ide-prompt__title"><h5><strong>입력형식</strong></div><div class="ide-prompt"><p class="ide-prompt__desc"><p class="qti-paragraph" dir="ltr"><span>첫째줄에 두차량 A,B의 주행거리가 한칸의 공백을 두고 주어진다.</span><br></p></p></div></div>

<hr>

<div class="ide-example__input"><div class="ide-prompt__title"><h5><strong>출력형식</strong></div><div class="ide-prompt"><p class="ide-prompt__desc"><p class="qti-paragraph" dir="ltr"><p class="qti-paragraph" dir="ltr"><p class="qti-paragraph" dir="ltr"><span>주행거리를 비교해서 첫째줄에 아래의 글자를 출력한다.</span></p>
<p class="qti-paragraph" dir="ltr"><span>- A가 B 보다 큰 경우 A를 출력한다.</span></p>
<p class="qti-paragraph" dir="ltr"><span>- A가 B 보다 작은 경우 B를 출력한다.</span></p>
<p class="qti-paragraph" dir="ltr"><span>- A와 B의 주행거리가 같은 경우 same을 출력한다.</span><br></p><br></p></p></div></div>

<hr>

<div><div class="ide-question__example"><div class="ide-example__input" style="margin-top: 16px;"><div class="ide-prompt__title"><h5><strong>입력 예시 1</strong></div><div class="ide-example__view" style="white-space: pre-line;"><p class="ide-example__input_code">3500<span style="position:relative">&nbsp;<span class="test-case-format-entity" style="position: absolute; bottom: 0; left: 50%; transform: translateX(-50%); font-family: menlo, 'segoe ui symbol', 'dejavu sans mono'">␣</span></span>2000</p></div></div><div class="ide-example__input" style="margin-top: 16px;"><div class="ide-prompt__title"><strong>출력 예시 1</strong></div><div class="ide-example__view" style="white-space: pre-line;"><p class="ide-example__input_code">A</p></div></div></div></div>

<hr>

<div><div class="ide-question__example"><div class="ide-example__input" style="margin-top: 16px;"><div class="ide-prompt__title"><strong>입력 예시 2</strong></div><div class="ide-example__view" style="white-space: pre-line;"><p class="ide-example__input_code">1500<span style="position:relative">&nbsp;<span class="test-case-format-entity" style="position: absolute; bottom: 0; left: 50%; transform: translateX(-50%); font-family: menlo, 'segoe ui symbol', 'dejavu sans mono'">␣</span></span>1800</p></div></div><div class="ide-example__input" style="margin-top: 16px;"><div class="ide-prompt__title"><strong>출력 예시 2</strong></div><div class="ide-example__view" style="white-space: pre-line;"><p class="ide-example__input_code">B</p></div></div></div></div>

<hr>

<div><div class="ide-question__example"><div class="ide-example__input" style="margin-top: 16px;"><div class="ide-prompt__title"><strong>입력 예시 3</strong></div><div class="ide-example__view" style="white-space: pre-line;"><p class="ide-example__input_code">5000<span style="position:relative">&nbsp;<span class="test-case-format-entity" style="position: absolute; bottom: 0; left: 50%; transform: translateX(-50%); font-family: menlo, 'segoe ui symbol', 'dejavu sans mono'">␣</span></span>5000</p></div></div><div class="ide-example__input" style="margin-top: 16px;"><div class="ide-prompt__title"><strong>출력 예시 3</strong></div><div class="ide-example__view" style="white-space: pre-line;"><p class="ide-example__input_code">same</p></div></div></div></div>


> 출처: Softeer 코딩 테스트 연습, https://softeer.ai/practice/6253