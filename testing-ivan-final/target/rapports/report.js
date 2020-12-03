$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Comment.feature");
formatter.feature({
  "line": 1,
  "name": "Comment feature",
  "description": "Отговаря за постването на коментари в теми само от регистрирани потребители",
  "id": "comment-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Успешно постване на коментар",
  "description": "",
  "id": "comment-feature;успешно-постване-на-коментар",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "Потребител отваря форум страницата",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "се е регистрирал в системата",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "се е логнал в системата",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "натисне на съществуваща тема на сайта",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "визуализира се страница за темата",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "натисне бутон за писане на коментар",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "визуализира се попъп за писане на коментар",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "въведе валидно съобщение",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "натисне бутона за постване",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "Потребител вижда съобщение \"Коментарът ви е публикуван успешно!\"",
  "keyword": "Then "
});
formatter.match({
  "location": "CommonSteps.потребител_отваря_форум_страницата()"
});
formatter.result({
  "duration": 124143100,
  "status": "passed"
});
formatter.match({
  "location": "CommonSteps.се_е_регистрирал_в_системата()"
});
formatter.result({
  "duration": 30700,
  "status": "passed"
});
formatter.match({
  "location": "CommonSteps.се_е_логнал_в_системата()"
});
formatter.result({
  "duration": 18700,
  "status": "passed"
});
formatter.match({
  "location": "CommonSteps.натисне_на_съществуваща_тема_на_сайта()"
});
formatter.result({
  "duration": 761100,
  "status": "passed"
});
formatter.match({
  "location": "CommonSteps.визуализира_се_страница_за_темата()"
});
formatter.result({
  "duration": 1713200,
  "status": "passed"
});
formatter.match({
  "location": "CommentSteps.натисне_бутон_за_писане_на_коментар()"
});
formatter.result({
  "duration": 605800,
  "status": "passed"
});
formatter.match({
  "location": "CommentSteps.визуализира_се_попъп_за_писане_на_коментар()"
});
formatter.result({
  "duration": 37100,
  "status": "passed"
});
formatter.match({
  "location": "CommentSteps.въведе_валидно_съобщение()"
});
formatter.result({
  "duration": 31200,
  "status": "passed"
});
formatter.match({
  "location": "CommentSteps.натисне_бутона_за_постване()"
});
formatter.result({
  "duration": 56900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Коментарът ви е публикуван успешно!",
      "offset": 28
    }
  ],
  "location": "CommentSteps.потребител_вижда_съобщение(String)"
});
formatter.result({
  "duration": 2191400,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "Постване на празен коментар",
  "description": "",
  "id": "comment-feature;постване-на-празен-коментар",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 16,
  "name": "Потребител отваря форум страницата",
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "се е регистрирал в системата",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "се е логнал в системата",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "натисне на съществуваща тема на сайта",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "визуализира се страница за темата",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "натисне бутон за писане на коментар",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "визуализира се попъп за писане на коментар",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "въведе празно съобщение",
  "keyword": "When "
});
formatter.step({
  "comments": [
    {
      "line": 24,
      "value": "#Maybe ^^^ needs to be gone completely? Or made into it\u0027s own scenario for specific Empty string?"
    }
  ],
  "line": 25,
  "name": "натисне бутона за постване",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "Потребител вижда съобщение \"Въведете коментар!\"",
  "keyword": "Then "
});
formatter.match({
  "location": "CommonSteps.потребител_отваря_форум_страницата()"
});
formatter.result({
  "duration": 44500,
  "status": "passed"
});
formatter.match({
  "location": "CommonSteps.се_е_регистрирал_в_системата()"
});
formatter.result({
  "duration": 15400,
  "status": "passed"
});
formatter.match({
  "location": "CommonSteps.се_е_логнал_в_системата()"
});
formatter.result({
  "duration": 20500,
  "status": "passed"
});
formatter.match({
  "location": "CommonSteps.натисне_на_съществуваща_тема_на_сайта()"
});
formatter.result({
  "duration": 25300,
  "status": "passed"
});
formatter.match({
  "location": "CommonSteps.визуализира_се_страница_за_темата()"
});
formatter.result({
  "duration": 14400,
  "status": "passed"
});
formatter.match({
  "location": "CommentSteps.натисне_бутон_за_писане_на_коментар()"
});
formatter.result({
  "duration": 68800,
  "status": "passed"
});
formatter.match({
  "location": "CommentSteps.визуализира_се_попъп_за_писане_на_коментар()"
});
formatter.result({
  "duration": 20000,
  "status": "passed"
});
formatter.match({
  "location": "CommentSteps.въведе_празно_съобщение()"
});
formatter.result({
  "duration": 40400,
  "status": "passed"
});
formatter.match({
  "location": "CommentSteps.натисне_бутона_за_постване()"
});
formatter.result({
  "duration": 21800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Въведете коментар!",
      "offset": 28
    }
  ],
  "location": "CommentSteps.потребител_вижда_съобщение(String)"
});
formatter.result({
  "duration": 68700,
  "status": "passed"
});
formatter.scenario({
  "line": 28,
  "name": "Постване на твърде дълъг коментар",
  "description": "",
  "id": "comment-feature;постване-на-твърде-дълъг-коментар",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 29,
  "name": "Потребител отваря форум страницата",
  "keyword": "Given "
});
formatter.step({
  "line": 30,
  "name": "се е регистрирал в системата",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "се е логнал в системата",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "натисне на съществуваща тема на сайта",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "визуализира се страница за темата",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "натисне бутон за писане на коментар",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "визуализира се попъп за писане на коментар",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "въведе прекалено дългъг коментар",
  "keyword": "When "
});
formatter.step({
  "line": 37,
  "name": "натисне бутона за постване",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "Потребител вижда съобщение \"Превишена дължина на коментар!\"",
  "keyword": "Then "
});
formatter.match({
  "location": "CommonSteps.потребител_отваря_форум_страницата()"
});
formatter.result({
  "duration": 35400,
  "status": "passed"
});
formatter.match({
  "location": "CommonSteps.се_е_регистрирал_в_системата()"
});
formatter.result({
  "duration": 11500,
  "status": "passed"
});
formatter.match({
  "location": "CommonSteps.се_е_логнал_в_системата()"
});
formatter.result({
  "duration": 10400,
  "status": "passed"
});
formatter.match({
  "location": "CommonSteps.натисне_на_съществуваща_тема_на_сайта()"
});
formatter.result({
  "duration": 11300,
  "status": "passed"
});
formatter.match({
  "location": "CommonSteps.визуализира_се_страница_за_темата()"
});
formatter.result({
  "duration": 11100,
  "status": "passed"
});
formatter.match({
  "location": "CommentSteps.натисне_бутон_за_писане_на_коментар()"
});
formatter.result({
  "duration": 24000,
  "status": "passed"
});
formatter.match({
  "location": "CommentSteps.визуализира_се_попъп_за_писане_на_коментар()"
});
formatter.result({
  "duration": 10800,
  "status": "passed"
});
formatter.match({
  "location": "CommentSteps.въведе_прекалено_дългъг_коментар()"
});
formatter.result({
  "duration": 16900,
  "status": "passed"
});
formatter.match({
  "location": "CommentSteps.натисне_бутона_за_постване()"
});
formatter.result({
  "duration": 13900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Превишена дължина на коментар!",
      "offset": 28
    }
  ],
  "location": "CommentSteps.потребител_вижда_съобщение(String)"
});
formatter.result({
  "duration": 48000,
  "status": "passed"
});
});