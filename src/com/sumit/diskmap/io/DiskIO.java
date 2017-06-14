package com.sumit.diskmap.io;

import com.sumit.diskmap.Record;

public interface DiskIO extends Iterable<Record> {

    Record lookup(long location);

    long write(Record r);

    void update(Record r);

    void update(Record...rs);

    long size();

    void close();

    void vacuum(RecordFilter filter) throws Exception;

    void clear();

    public interface RecordFilter{
        public boolean accept(Record r);

        void update(Record r, long newLocation);
    }
}
