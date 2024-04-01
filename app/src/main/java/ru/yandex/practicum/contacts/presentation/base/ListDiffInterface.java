package ru.yandex.practicum.contacts.presentation.base;

public interface ListDiffInterface<T> {
    public boolean theSameAs(T type);
    public boolean equals(Object o);

}
