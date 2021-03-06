create index IX_267CE088 on Contato (accountId);
create index IX_CDBF5217 on Contato (cargoId);
create index IX_F5297DA5 on Contato (classNameId, classPK);
create index IX_D48EEAD8 on Contato (companyId);
create index IX_9CD0478F on Contato (companyId, cargoId);
create index IX_A419A761 on Contato (companyId, dataNascimento);
create index IX_B64C9F0D on Contato (companyId, endEmail);
create index IX_4D153CD2 on Contato (companyId, groupId);
create index IX_278D8ED5 on Contato (companyId, groupId, cargoId);
create index IX_D5C0C55B on Contato (companyId, groupId, dataNascimento);
create index IX_83384087 on Contato (companyId, groupId, endEmail);
create index IX_2974701F on Contato (companyId, groupId, nome);
create index IX_2BD901A5 on Contato (companyId, nome);
create index IX_53AB33D9 on Contato (dataNascimento);
create index IX_A33EE585 on Contato (endEmail);
create index IX_D421441D on Contato (nome);

create index IX_A924A288 on Endereco (bairro);
create index IX_704B96EF on Endereco (cep);
create index IX_E5E1A142 on Endereco (cidadeId);
create index IX_4FE69F59 on Endereco (companyId);
create index IX_D95F3E72 on Endereco (companyId, bairro);
create index IX_10869345 on Endereco (companyId, cep);
create index IX_F1E4EAAC on Endereco (companyId, cidadeId);
create index IX_66E7D295 on Endereco (companyId, classNameId);
create index IX_D4DC18EE on Endereco (companyId, classNameId, classPK);
create index IX_223C6AB0 on Endereco (companyId, classNameId, classPK, principal);
create index IX_3303108A on Endereco (companyId, groupId, bairro);
create index IX_BCC9B82D on Endereco (companyId, groupId, cep);
create index IX_71DC96C4 on Endereco (companyId, groupId, cidadeId);
create index IX_1DCB8F7D on Endereco (companyId, groupId, classNameId);
create index IX_E14ECFBB on Endereco (companyId, groupId, paisId);
create index IX_C40EABB6 on Endereco (companyId, groupId, uf);
create index IX_87AAFDA3 on Endereco (companyId, paisId);
create index IX_B63E0D9E on Endereco (companyId, uf);
create index IX_577061B9 on Endereco (paisId);
create index IX_B954ECB4 on Endereco (uf);
create index IX_5EF80565 on Endereco (uuid_);
create index IX_74D31DA3 on Endereco (uuid_, companyId);
create unique index IX_6ABCB0E5 on Endereco (uuid_, groupId);

create index IX_79283A4F on EnderecoEmail (companyId);
create index IX_85B0375F on EnderecoEmail (companyId, classNameId);
create index IX_49377764 on EnderecoEmail (companyId, classNameId, classPK);
create index IX_BD9C867A on EnderecoEmail (companyId, classNameId, classPK, principal);
create index IX_10F98B5B on EnderecoEmail (uuid_);
create index IX_D7D161ED on EnderecoEmail (uuid_, companyId);
create unique index IX_50337FAF on EnderecoEmail (uuid_, groupId);

create index IX_66FF79D8 on Telefone (companyId);
create index IX_81883E76 on Telefone (companyId, classNameId);
create index IX_15107A2D on Telefone (companyId, classNameId, classPK);
create index IX_ADE91C11 on Telefone (companyId, classNameId, classPK, principal);
create index IX_F367F764 on Telefone (uuid_);
create index IX_FBA64644 on Telefone (uuid_, companyId);
create unique index IX_DBD38DC6 on Telefone (uuid_, groupId);