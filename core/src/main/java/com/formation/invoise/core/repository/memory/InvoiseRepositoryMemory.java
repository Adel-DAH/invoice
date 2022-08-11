package com.formation.invoise.core.repository.memory;

import com.formation.invoise.core.entity.invoise.Invoise;
import com.formation.invoise.core.repository.InvoiseRepositoryInterface;

import java.util.Optional;

//@Repository
public class InvoiseRepositoryMemory implements InvoiseRepositoryInterface {


    @Override
    public <S extends Invoise> S save(S entity) {
        throw new UnsupportedOperationException();
    }

    @Override
    public <S extends Invoise> Iterable<S> saveAll(Iterable<S> entities) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Optional<Invoise> findById(String s) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean existsById(String s) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Iterable<Invoise> findAll() {
        throw new UnsupportedOperationException();
    }

    @Override
    public Iterable<Invoise> findAllById(Iterable<String> strings) {
        throw new UnsupportedOperationException();
    }

    @Override
    public long count() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void deleteById(String s) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void delete(Invoise entity) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void deleteAllById(Iterable<? extends String> strings) {

        throw new UnsupportedOperationException();
    }

    @Override
    public void deleteAll(Iterable<? extends Invoise> entities) {

        throw new UnsupportedOperationException();

    }

    @Override
    public void deleteAll() {
        throw new UnsupportedOperationException();

    }
}
