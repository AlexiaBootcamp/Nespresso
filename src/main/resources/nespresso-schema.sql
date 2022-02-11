drop table if exists nespresso CASCADE;
CREATE TABLE nespresso (
    id BIGINT AUTO_INCREMENT,
    aroma VARCHAR(255) NOT NULL,
    intensity INTEGER NOT NULL,
    name VARCHAR(255) NOT NULL,
    roastiness VARCHAR(255) NOT NULL,
    type VARCHAR(255) NOT NULL,
    PRIMARY KEY (id)
);
