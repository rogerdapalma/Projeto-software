-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `mydb` DEFAULT CHARACTER SET utf8 ;
-- -----------------------------------------------------
-- Schema projeto
-- -----------------------------------------------------
USE `mydb` ;

-- -----------------------------------------------------
-- Table `mydb`.`PessoaFisica`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`PessoaFisica` (
  `idPessoaFisica` INT NOT NULL,
  `cpf` VARCHAR(14) NOT NULL,
  `nome` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idPessoaFisica`),
  UNIQUE INDEX `idPessoaFisica_UNIQUE` (`idPessoaFisica` ASC) VISIBLE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`PessoaJuridica`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`PessoaJuridica` (
  `idPessoaJuridica` INT NOT NULL,
  `cnpj` VARCHAR(18) NOT NULL,
  `nomeFantasia` VARCHAR(45) NOT NULL,
  `razaoSocial` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idPessoaJuridica`),
  UNIQUE INDEX `idPessoaJuridica_UNIQUE` (`idPessoaJuridica` ASC) VISIBLE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Cliente`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Cliente` (
  `idCliente` INT NOT NULL,
  `PessoaFisica_idPessoaFisica` INT NOT NULL,
  `PessoaJuridica_idPessoaJuridica` INT NOT NULL,
  `endereco` VARCHAR(100) NOT NULL,
  `email` VARCHAR(50) NOT NULL,
  `fone` VARCHAR(14) NOT NULL,
  PRIMARY KEY (`idCliente`, `PessoaFisica_idPessoaFisica`, `PessoaJuridica_idPessoaJuridica`),
  UNIQUE INDEX `idCliente_UNIQUE` (`idCliente` ASC) VISIBLE,
  INDEX `fk_Cliente_PessoaFisica1_idx` (`PessoaFisica_idPessoaFisica` ASC) VISIBLE,
  INDEX `fk_Cliente_PessoaJuridica1_idx` (`PessoaJuridica_idPessoaJuridica` ASC) VISIBLE,
  CONSTRAINT `fk_Cliente_PessoaFisica1`
    FOREIGN KEY (`PessoaFisica_idPessoaFisica`)
    REFERENCES `mydb`.`PessoaFisica` (`idPessoaFisica`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Cliente_PessoaJuridica1`
    FOREIGN KEY (`PessoaJuridica_idPessoaJuridica`)
    REFERENCES `mydb`.`PessoaJuridica` (`idPessoaJuridica`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Colaborador`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Colaborador` (
  `idColaborador` INT NOT NULL,
  `dataAdminissao` DATE NOT NULL,
  `dataDisligamento` DATE NULL,
  PRIMARY KEY (`idColaborador`),
  UNIQUE INDEX `idColaborador_UNIQUE` (`idColaborador` ASC) VISIBLE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Projeto`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Projeto` (
  `idProjeto` INT NOT NULL,
  `Cliente_idCliente` INT NOT NULL,
  `idLider` INT NOT NULL,
  `matricula` VARCHAR(15) NOT NULL,
  `nome` VARCHAR(45) NOT NULL,
  `escopo` VARCHAR(20) NOT NULL,
  `dataInicio` DATE NULL,
  `Projetocol` VARCHAR(45) NULL,
  `dataPrevConclusao` DATE NULL,
  `dataConclusao` DATE NULL,
  PRIMARY KEY (`idProjeto`),
  UNIQUE INDEX `idProjeto_UNIQUE` (`idProjeto` ASC) VISIBLE,
  INDEX `fk_Projeto_Cliente_idx` (`Cliente_idCliente` ASC) VISIBLE,
  INDEX `fk_Projeto_Colaborador1_idx` (`idLider` ASC) VISIBLE,
  CONSTRAINT `fk_Projeto_Cliente`
    FOREIGN KEY (`Cliente_idCliente`)
    REFERENCES `mydb`.`Cliente` (`idCliente`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Projeto_Colaborador1`
    FOREIGN KEY (`idLider`)
    REFERENCES `mydb`.`Colaborador` (`idColaborador`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Alocacao`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Alocacao` (
  `idAlocacao` INT NOT NULL,
  `Colaborador_idColaborador` INT NOT NULL,
  `Projeto_idProjeto` INT NOT NULL,
  `horasSemana` DECIMAL(6,1) NULL,
  `valorHora` DECIMAL(11,2) NULL,
  PRIMARY KEY (`idAlocacao`),
  UNIQUE INDEX `idAlocacao_UNIQUE` (`idAlocacao` ASC) VISIBLE,
  INDEX `fk_Alocacao_Colaborador1_idx` (`Colaborador_idColaborador` ASC) VISIBLE,
  INDEX `fk_Alocacao_Projeto1_idx` (`Projeto_idProjeto` ASC) VISIBLE,
  CONSTRAINT `fk_Alocacao_Colaborador1`
    FOREIGN KEY (`Colaborador_idColaborador`)
    REFERENCES `mydb`.`Colaborador` (`idColaborador`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Alocacao_Projeto1`
    FOREIGN KEY (`Projeto_idProjeto`)
    REFERENCES `mydb`.`Projeto` (`idProjeto`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Tarefa`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Tarefa` (
  `idTarefa` INT NOT NULL,
  `Colaborador_idColaborador` INT NOT NULL,
  `Projeto_idProjeto` INT NOT NULL,
  `descricao` VARCHAR(45) NOT NULL,
  `status` VARCHAR(10) NOT NULL,
  `PrevisaoHoras` DECIMAL(6,1) NULL,
  `qtdHoras` DECIMAL(6,1) NULL,
  PRIMARY KEY (`idTarefa`, `Projeto_idProjeto`),
  UNIQUE INDEX `idTarefa_UNIQUE` (`idTarefa` ASC) VISIBLE,
  INDEX `fk_Tarefa_Colaborador1_idx` (`Colaborador_idColaborador` ASC) VISIBLE,
  INDEX `fk_Tarefa_Projeto1_idx` (`Projeto_idProjeto` ASC) VISIBLE,
  CONSTRAINT `fk_Tarefa_Colaborador1`
    FOREIGN KEY (`Colaborador_idColaborador`)
    REFERENCES `mydb`.`Colaborador` (`idColaborador`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Tarefa_Projeto1`
    FOREIGN KEY (`Projeto_idProjeto`)
    REFERENCES `mydb`.`Projeto` (`idProjeto`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
