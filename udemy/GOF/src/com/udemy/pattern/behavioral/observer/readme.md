 Cоздает механизм подписки, позволяющий одним объектам следить
 и реагировать на события, происходящие в других объектах.

 ТАК ЖЕ ИЗВЕСТЕН КАК:
 Издатель-Подписчик, Producer-Consumer, Слушатель, Наблюдатель

 ПРИМЕНИМОСТЬ:
 * Когда после изменения состояния одного объекта требуется что-то
 сделать в других, но вы не знаете наперёд, какие именно объекты
 должны отреагировать.
 * Когда одни объекты должны наблюдать за другими, но только в
 определённых случаях.

 ПРЕИМУЩЕСТВА И НЕДОСТАТКИ:
 + Издатели не зависят от конкретных классов подписчиков и наоборот.
 + Вы можете подписывать и отписывать получателей на лету.
 + Реализует принцип открытости/закрытости.
 - Подписчики оповещаются в случайном порядке.