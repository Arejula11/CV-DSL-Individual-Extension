FROM python:3.11-slim

WORKDIR /app
# Instala dependencias del runtime: Graphviz y LaTeX (pdflatex)
RUN apt-get update && apt-get install -y --no-install-recommends \
	graphviz \
	lmodern \
	texlive-latex-base \
	texlive-fonts-recommended \
	texlive-latex-recommended \
	texlive-latex-extra \
	texlive-pictures \
	texlive-fonts-extra \
	&& rm -rf /var/lib/apt/lists/*

COPY requirements.txt .
RUN pip install --no-cache-dir -r requirements.txt

COPY app ./app

CMD ["uvicorn", "app.main:app", "--host", "0.0.0.0", "--port", "8000"]