package com.javarush.task.task17.task1713;

import java.util.*;

/* 
Общий список
*/

public class Solution implements List<Long> {
    private ArrayList<Long> original = new ArrayList<>();

    public static void main(String[] args) {
    }

    @Override
    public synchronized int size() {
        return this.original.size();
    }

    @Override
    public synchronized boolean isEmpty() {
        return this.original.isEmpty();
    }

    @Override
    public synchronized boolean contains(Object o) {
        return this.original.contains(o);
    }

    @Override
    public synchronized Iterator<Long> iterator() {
        return this.original.iterator();
    }

    @Override
    public synchronized Object[] toArray() {
        return this.original.toArray();
    }

    @Override
    public synchronized <T> T[] toArray(T[] ts) {
        return this.original.toArray(ts);
    }

    @Override
    public synchronized boolean add(Long aLong) {
        return this.original.add(aLong);
    }

    @Override
    public synchronized boolean remove(Object o) {
        return this.original.remove(o);
    }

    @Override
    public synchronized boolean containsAll(Collection<?> collection) {
        return this.original.containsAll(collection);
    }

    @Override
    public synchronized boolean addAll(Collection<? extends Long> collection) {
        return this.original.addAll(collection);
    }

    @Override
    public synchronized boolean addAll(int i, Collection<? extends Long> collection) {
        return this.original.addAll(i, collection);
    }

    @Override
    public synchronized boolean removeAll(Collection<?> collection) {
        return this.original.removeAll(collection);
    }

    @Override
    public synchronized boolean retainAll(Collection<?> collection) {
        return this.original.retainAll(collection);
    }

    @Override
    public synchronized void clear() {
        this.original.clear();
    }

    @Override
    public synchronized Long get(int i) {
        return this.original.get(i);
    }

    @Override
    public synchronized Long set(int i, Long aLong) {
        return this.original.set(i, aLong);
    }

    @Override
    public synchronized void add(int i, Long aLong) {
        this.original.add(i, aLong);
    }

    @Override
    public synchronized Long remove(int i) {
        return this.original.remove(i);
    }

    @Override
    public synchronized int indexOf(Object o) {
        return this.original.indexOf(o);
    }

    @Override
    public synchronized int lastIndexOf(Object o) {
        return this.original.lastIndexOf(o);
    }

    @Override
    public synchronized ListIterator<Long> listIterator() {
        return this.original.listIterator();
    }

    @Override
    public synchronized ListIterator<Long> listIterator(int i) {
        return this.original.listIterator(i);
    }

    @Override
    public synchronized List<Long> subList(int i, int i1) {
        return this.original.subList(i, i1);
    }
}