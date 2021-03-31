SELECT count(1) FROM public.cozinha;

SELECT count(1) FROM public.cozinha WHERE horafechamento = 22;

SELECT count(1) FROM public.ingrediente WHERE datavalidade < DATE(NOW());