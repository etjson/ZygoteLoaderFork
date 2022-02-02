#pragma once

#include <cstdint>

class Chunk {
public:
    Chunk(uint32_t length);
    ~Chunk();

public:
    uint32_t getLength() const;
    const void *getData() const;
    void *getData();

private:
    uint8_t *data;
    uint32_t length;
};
