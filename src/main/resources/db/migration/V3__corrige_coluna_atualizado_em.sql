ALTER TABLE alunos
RENAME COLUMN aualizado_em TO atualizado_em;

ALTER TABLE faturas_matriculas
ALTER COLUMN data_cancelamento TYPE TIMESTAMP
USING data_cancelamento::TIMESTAMP;
