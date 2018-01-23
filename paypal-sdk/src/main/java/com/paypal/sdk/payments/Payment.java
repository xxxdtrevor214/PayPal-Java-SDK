// This class was generated on Mon, 22 Jan 2018 14:30:02 PST by version 0.1.0-dev+8c35d5 of Braintree SDK Generator
// Payment.java
// @version 0.1.0-dev+8c35d5
// @type object
// @data H4sIAAAAAAAC/+x96XIbObfY/zwFynOrxlKRlLfxLPmlkeQZZryotN26cVwk2H1I4goN9ABoUpxUqvIaeb08SQpb7y2JMtWW8+GXRCwNnAPg4Oz4n88uNik8++1ZijcJMPVs8OwKC4JnFD7iRFc8Gzz7CzbFj2OQkSCpIpw9++3ZIXIdR+hSAlJLIhGf/SdECimOIgFYwQClgkcg5QBhFqMEM7wA30+Ong2eHQqBN3YiLwbPzgDHnxjdPPttjqkEXfB3RgTEecGp4CkIRUA+++1zDoJUgrBFEwI7i4kiCVSAqZZX4bpYAoqxAjNj3QKtl8CQWuYTR2ssHYDxABGGPo+ZAsFA1TrOuUiw+vJ8qVQqfzs4UJxTOSKg5iMuFgdLldADMY9ev3796w8SIj2B4U+jt3tfixiWUfq/BndiB25SEARYBJNU8DmhMCFxBU9dLZoYO8WbU0yHC2AgNF7Q+FiDb9CWgIiWmKkfZY7B4sPIfXiE3nGBCLM4I5wNkARAny2e0RpmLZ2+PD+IeSQPcEoO3KeHRauDH9YwG7qmcmK/1Bdy55jQTMBEAJacVbDaqGqi01ahiMdmFyGcY8517gmK2n7oWPzxMeLz8gnpa3ZMWcJVmqEvas7SY9A2GaErTDNARP72P7IXL15HGTV/wf6ipPxLr4P9LTF1ZQdF4Qh9wNcgEWaIJAnERO9YjwrXuvrBrs/jTC25IP+0jfH50FfK8n7gAkU4VZkARLEC4c+EBnMhzFE6iImASPkjIg9ch6ErONjbbpZcxCDaZnhkjphBhGlzn7mYhrJrCgd+WbbZUUpkt28oStj1JC52yMReXM0dphvKygbzJbXLkCGsZ6fPgYC/M5BqKIAaSvj5z8OLk0+H58h0LZMsvgKxIrA++GGJFXAsh6ZJnUS93f3FuBQwr4DlCpqnJuJJSkEBUlgsQKHLs/cjdMFRgq/BHHkPZoQpHejmM8LA0X215DFaE7W07IGGzl6Yl2djpCBJddf7XpNvf/r5xd4IjVlEs9iOMP236QBNn08tezHdm6JoiQWOFAhpTkaqN7llQQhbjJCGaKphnSIizSeuYYP8AmlYOdOnSi2xsuuFcI4CC6OFByOZzaReaaZMcU8kz+K0snR5UXPx/ry4OPXLINzomjtrXbyeIBBAK9O3v5tz/6zRbydIOENqk8KdW+SnX3/5Jeek3uwN0HpJoiWSIFaaKhnC5BgTbJbXLnTGcDIji4xnkm6QpQszsPtDQoKZIpH0V5zuNkLnmjd5r79w5mYoi9mt1+sRwQybuWEpyYJZWqf7Dj1I9Z+jGw3GbviTL/dYCMY1C8wnKd6AqCxJvabO+M8FwFCfWjQnQGOLxIgSDSOKMEOZFgg4ksBihJH+nP7pGAQQO95pfpo1+JpwdcFjytF6ydE8Y3Hpdh193a1T0GH9XcIWE8KkElm7uNVsU7152uu77yGMNM2jgFxHVHTMWfMoE0L/zkW5K0xJjDijG0NSc6KRdxAQE03xRJyzIJbAWOJqR08yqfksS6iBqCXoAze1nSe68xRxUSmYKH4NbOpEyBEa29NmvxdxpjBhEiVcaMKl+QsGJYAGFfmMSBRDRAmDeHdXaWmurYJmqbIiaJbKq2v1+fjk9Ozk6PDi5PgLOixjdoSOMEMz0OfI0Gu9gqVdaQTuggU0i6FxATjenUyN41iAlE1YZ4RSvQ+LBgW8zbomYXdtkGuj+YESaA5yuFHAYrfx5JKkaalLD4oDojbVhbQFLfwRURvEcNKXRBbxjCmxmWi+uzrDakXLharWfJjzR2h8/gm9fvn27fClETNvYdUFSHXgPj/UbeXBnqX5JAamyJy4u9K10UdbwIJw5nj6GeXR9d8ZV1Bm7aUSnC1syUeuwMlhB+VydFH6bC4N/6HFDPS7IJoo6NNeF1D++L0hnRhyxrhqtL38q6WttEePWL2P4umQwgooinmih9TrLR1N1FefnaBXhAGaHr2aNqd9tCQMozUXNF4TV6Z5Syz0+qKMaTInOKUQo1SQCNDzo8vTPUdfB2iG2bU57JbdjQSXcjgz8hNSAjOJI8tIOIDqaN+pCNW1PzXVfVmXmExJc0fOiZCGzQbPXPkDbpRBcIM14z1ALEtmIAZIKgGgLPSSI85GvYH0qgHSqwZIn8w/mNqbUELEWXwP6GRGFAwQTrFQhp57cB8G5sNJC9NyGCX/mMM/kQqrTNb4wtYGzYX1pL3SAdkOI3QGKhMMHJthxDTNgEk0FzxBvwv8D+lLGEmXnFXJqC9p0R/pmnxxtBR7Mnr56nVDfDXcv8pGhGnSGR1cDM9Ojoam7fDVixcvX7wajg+A7Y3QB3xDkixBFNhCLTUh++lFSYLtCwdcKkybF0q1vAUfpt6QNy9oOZn6H5Jaqqe3+d8ZWWFq7vaLTUq0pLmp8pWWUOpLxInWpS/rT2BW+YoRvU6LJgXmgY3W5JqkEBMre+lfB6cFHH0pf/VOryLTl7Rcy/e5fU33/O618uvluTlRBkUa6wWOTANuuO4ct/rYlXn50n2BSIU86VUklsG2dEtC8Znf0OdDsdC3PsPbTPoH7HvtDdBne8a36j8zXXTnI8xwvN3gkemiO49ZTLbrS3QP01Vhutmuq+6hu/43nGK2Vdf/1D101w9wQyK+Vd/EdNGdL5aYUMzirbor12lvoHfW50tGFMToXDeRW30ok7iVyL154STT4WyjoH+C13Kz3eMuc7dXP1NUuro8QVfQnJ6uMNJ+K28x/fPTh5PJp7PJv386+2s6QNM/xu8uprtmLe6jbYpWqyoP5QpaIFoKgKERe3kmhjFZeIXDClMSW15Cb7Edr4XZ022KJLhJiYBJwpla1s2j5YomKKaBnbBpZC84xhEFbFQy/4DghSXKMkDTl1MN/PTlq+lu+du7ANwAFm3wufIW/r1YnxKkunk/jLmRHyZaGKsqysrFLRK73kpLTmMQP0ong/QowFPcNudy6V1T1m0fY8bBKhasYsEqFqxi/9pWMSPfV9UevqiFDpTMIbZZ6TZnWQKCROXTZzQengmQKY5AaiY7zVikMgPwCH3IpEIRN55Q3myW8Dij3Jxnx0fnG3e2QYCjZWUqeluM0P4ZxHpco8cUIFPOJMjRfi938/052ObEcwxOV0RiTcwSLBUIYzgaoGlMZKRviamRUKY4gZudsErl/dEwTd1q9MmbtJp+8tq64dGUk380qSkjweiUb7UA9eE5mc+edNq0Jrc6hDVgIlqK4qJQrFuvQbTCGVX98rpPnZn/enHlW3HzX8cZv2lwxW9aJ2t4YD1jZGac30Nuf7XQ5Z6UqXgDon5iSoV1CpAx8ndmDow5IRuemZNvr0frSSxwdG19kHWtAVCzXyUI3Wkyx0hTxMyYh83PKi40q0ekHk0PsgSa6s2JV5zEeibGMdKYMMwnuEAJkea/ymGW1c/MAGG20cJ5BmaKa57RGFFybbw+sJQ8Mh6RjuUFJPHKcFciHiCZRUvDg6DLy/HxQA8sjHBjaDskmNBCt7G/nysxc4R0AovIHGE09cifGrdtLsiCMKODTgVfkbj8Kf+RmqPDaH//qWl9dnRn2l4SYQF6E1G+1h0k/FcUc2MszaxBU4JdXis+xESmFG92xJJ9qXvyTEpO4J0HjM152xGzxa2+v1DxLg9+EsFPIvhJBD+J4CcR/CSCn0Twkwh+EsFPIvhJBD+J4CcR/CS+qZ/EjAi1nMR1ulgpbpMVhVra6PMiEtdfv9Xo9AcHpdcw9vLXX18MX7wZ7l6zuXuRziDjR9kU7V4Mc9GuEEK2FPH6itZPMKnaCH1JN7w19VmTxLx89XP/dOVhbhsepu/CYcNP9rFcNToN4SSOKTRnWy3vnq9t1+eMt1OYl1JNWBU5xAhYJDapvnutlm98/BSFIofgsnDUdiBffQvBRs9p0rhKK8VdYp5RPvfEjmCaKa8VLrEk5eJuxBfNdj1dp3SddCqCW1qUpt+sbDM9Oi2va1SSI43+DTuvjJr+t6oyDsrgoAwOyuCgDA7K4KAMDsrgoAx+aspgARFJCbAWYatR1USsrvAkI2+OsLI+1jsyiAe1dlBrB7V2UGsHtfa2am2Zzefkpop0X3SL0G6a9IV0fFPXQ+VFHVP8v//7/0ik8A0aH4/QeZamXKhSsiTn3lzNk2QYuF5Baqp2quV3A+d8DHuH8Mv9FIh67ElLDFCjqjspqM9hlbtROsj+HVMKeX4sJ05akodimBFlqKQrKPuMPkVaZqs0ufAHzEGJI3PD73zNND40ZiaZoLKN46tWlxm+ak3dbVqCskGFDvOXZ+9l4UHtPHvNLnXa4hmWEPeZeRqzCKieflXfVC5uLtDl2Xu0XoKAwoSn96IHE2KE5woEWhquT5rIUP1BWUm+W3aTLlDgFzlHwv5+b4y9Fl0buKgU7wIXONULD98SGV92LB04Dr+SXHmAfJZglydbc/t1fdYD0xu7rOYtuX0Ns1F83zjTyyyKQMp5pqVT13XLfMd2yboGnGV61X0jq1YswbjVUHNM6L0gc5HKyHbYYVriu09QaRotl3lJZqve5tWK7hhsnyLdx7dW9J/osIKFGOaEgUTrpZGhK8kVjQDKYpcxk84JrVMgzYVmaZ4NH24gyoqc2CawVtqcjfv70/I0pvv7/hUBHEWQKulb4UQf2FJ9C5fxFTHh9vNNrOflBb7zom52wjYZWN3MTAC+Hmap3Fk60c5bx6TzjGpWmKKwzb5hsm1ULBzDN69e/ox8t/sZOlzj3CfC09mYgzQWBGl5R4Qp9Z8mIHeri7ZYn8SgMGnjN4qKAjtFWavsR1w8lGuG8Ixn1fNgB318jmJB5mqyFjitTL9c2gRA1yJdi+YArf4fZdVprpC0uQRuvznOYQXMB9/NYM7dRR1DRBItEnByV/L7iy2br7kfz9789xzukWh1ZxIJzGIT2zOH6i1fq2iulm8QFktP+elJ04TJTGh+u/biRFHaXNO8NixqZVFzK1bnyvYlQTufiVanjHae3HtZhBXti6bmTjImirXOj7XV3r5syLcMJ/LpkVmZzRRXmNaUxXlhy9K6SseL5aAQBYnMU8l7uc4vpfUyMG0G1kqY2slu9C7Y3/fm1v39cMr70lbXtdTtNg98E1akJ2VV8yR2H8PKGdRLsbC5a7z+DtBsU3oExCgJBJgnNwZIQCpAmhdEjDHafkWVtA8AvrX/qE/m4D8Y9sQuMyB1Kxmk4klNxeCK7nopJn9GxDwW86PxGOzpWiklNqwpAMrlLW9BFiW5IjYT0RL3NnPCVpxEMGlJTdaoapNATBPng2WOjskoY2+8R3mvT9+pE0pkizqtXFUCo1Tarb40V7UlCVgAmoHm5vxa7PDlEz1O+8xlY9ZydzN+hISWT0cf+LTPuF6n8kEvm7qfjKTa8Irr9IUz4Bj3+qcS8mU8s6u2eVfSMfuIy7uFs54m/3eGmarHNpQKO0DwLZ4KGPI6q4pU5nebzZFH1+gawEjLGSMKPT//63KvIlaNnpZIYBBu5IIneHDrhu/bLN6KW1jKqarQ4QoTasIdyq/o5YEWJavdkkjFxSM434QgpxDkFIKcQpBTCHIKQU4hyCkEOYUgpxDkFIKcQpBTCHIKQU4hyKku5rbEojTrbnFRcEZ3I2lYWaLQ1Rcp0y/PT8/RKRYR0J6dZSY2N0yLQaKrxS3ANrgnoiSKMONMswSImOxl2PlhWpZKQ28dlGNvU9Qs19s3d934ptGeG8wMTjEboROmgZQoAREtsbFBciSXWJRDocwj9JFnwi1H4tRKnc/pW1mGGX6k0tv3sJqc9ZJropGnyo+LXPll7U5CFkuFZuCS6CdGHDXhR/M5mIENn2zkzNaFmCIbB8NZMbiBzQ3AmYOov+d2uIKJ4hNj362JFNWaLonqUMvuuWas4Iocm2QNxkZc1zxoKXqgL9FJkfmmEfxSKe5UBUpgedASMl1I5J5F6mf2RoXQmHy5tH3uboP584QkUcWzWmapHs346PdLS54xaCQZ6w5/BHMoBURAfEiR3Ur6WqkEPRhsPL7icZv8f5W8f61kxYDYDAD0vlL52xjVLxHry1//IGab2ocGJaeNCDMrzztktodWyhE6bkRR5pXGfBoDIxCjODOn3dSbR+iI8a91guNO4vvu/eyc3d71sOFqecvy5BnratFo7hW2HHePcTQm7vkOzYjgGCvccVba2tUOT1uTFgcK22ho9oBvuVs47z49M4FZ3JS5K8XdceizTBJm1Fa7V+d7HHr1Ut2kXasuGbVrNR10rJ508PEtJLuzQ3SkZ/U8XgwroHpqoxRvUkxHEU+2s1WUkuVqRHl1fU+swVZPDRI29Fho1Te+fVNja++vfnz7ZvjqxcsXL18Ox/09tPjw+6zCO/fk4tB4p8gkFuCpD7rsSEpQNGhmJSjquuMIXRvvu1wWB3fIyt59pjGlfA3x5JZkC51N7kq6cBdw9rEx6z+YhxPiNKUbz/S3cAy7tPDfKwuFc+qaGG6wut71qhaEuCYujtvJiNzkskXjsin10djmboW1ES0jqDM5tYrbDF6eHxrmbGWZ0fGwZ4zsGigncUwESJ6JCFpzUDSbVJ7hbdQ+gfjq3UU9lzMJtBz7WnXptNdqmkgpN9jha2shTDuEaYcw7RDGEMK0Q/xgCNMOYdohTDuEaQcyG8K0Q5h2CNMOYdohTDuEaXt9gsnHOFGkZvKqlreY63zSPt0CrZdgTfkVfY7J/ugSPra9MZh3f/Bjg7slZfNk3q1uqFaW3qOrlLfoZN4JnMXoA2Z4YczO6B2hekM8f/fh3Z5XxUQUS0mig3kyL6tlhouMxHDw7sO78yxJsNgc7HnlxePrKB4aJju38JUDZft6MVAPXNdAl0s7J7vla3APDgVxk2k4NVbLO6e59TtqD57o/cOI3dR2ZvO+D9WqLXHH2o6P88CZXaqZaxikhF1PSpt9YhOPtoYBXct6GND17bYCx+bmtoLPfx5enHw6PEemq6ceOCUHfAViRWB98MMSK+BYDk2TvcdPH7AUMK/qxmxBS6wjT1IKSjN9YgEmH/cIXXCU4GtwXL0FM8KUDnTzmebqrY+YkVycZxIx/P61vVQuz8ZIQZLSLd6tffvTzy/2RmhsmQfrC/lv0wGaPncuwdO9aYnZsEFGAoap4BFISdjC2qymGtapj1u5hg3yC6Rh5Qw822MWA+EcBRZGH7Ais5nUK+2S3vbmmNQwz95ijv3z4uK0bIs1ARSqY/F6MzvWk4W3M7OfNfrtBDVfosnonVvkp19/+SXnNt7seX5TgliBRFgizLyBEpvltQudMZzMyCLjmaQbdwnOnGughAQzRSLp6ZLu5gKS3usvnLkZypo7BmbWO9m+Zmqc1w5036EHqf5zdKPB2OvxeQUBTHmrfs2RoVZ1G6HOPRqYQ3fdzq+P2mwXiVzu//Cs9VNoRLdVK25xXzBRaI9/D3VCACwmbDERgGWNk2tUVaH4fHxyenZydHhxcvzFUDvbrghINitmv1FZIxP7MkKfZpJrWmfjmqe2t/HrmiLCpAK861V05JmLiQCZcibbXHzb2pQzjrRU1xNWRZxSiHyyJ7/SvkN+WxtvFImEj1c1fve41N5c7j345cQrEkHT1a5a3tzCuWO2bahP5ZKvNdE31i0j0FLjnzA30n+UCetXtqMHNO65w/FKtsBWFLbcB4fOSewKRO4tj843UkGCnh9ene/d4T64hhlOU1lUVsU4zZAdXp2fuQ1x5PwI/QYxJ6ivfA+rVYuPZVHYgpyjq6tHAV9a/H4LLEBEJjKbJUQpqHI89ZoWQu4pQuGYVFVzeIB6Y3rscM1lrdd0vYqex9VDXF2NUhz2AhgIS8V8tFCOiB8lkilE+uR8xWo+WDZdpbgqR7mCey3dFZFYowEEOszUEjQ/5o6/FqAi2GV4471YJ8GVvUsmQMmCzAitJ4/pbNKE2KYZ4XMkgVLQQovvipxKNr+5K96TW5mOHvZqzMn78R/j39+ftDyu8sFfNNZuo+zLPTMfL/KjROcWnNMCnFNOSWTNzpfMH0gbLOGCQViMxprgfOQKndmoki0fnjk9PLsYH75//x+Tx5t8Y4qoCyKrZHf6vwGSAGjavjWMImm6Hazjj/eEkXFVgjNjsdNud0H5JMxRt+DpHkdtcmfQ8ZbHrZrCJFefdyzntGLMnPp1muqdMm3u0emWx9klWRIH5fXJf9qpSpsFQaAZV8tcnLHO3GilyYG84zsPohnji5MPk4+fLiZnJ0cn46uT49sOot2ANgqs2KB4gbWwgSKKSWI5VZtwU+9j8SCycPnx8PLiz09n4/9+cjw5PfyPDycfL3Yysax87HMu+imcn5LwVmM5yuXN87GdyNhbdhUgqWq6qpeK2yAx1Wh8nHNJ1exleTh3/jrky7dDYwNELEtAkCg/fePjPNGuSYNWlhG5QAvj2pDJ/hJBPMx/v6a7KcITKktrckO6PGfCsove6ktkjZXuP/J6mwQ11bn2uWXtK2lNM221/CvMtBTrHWe+9l3YajtlA0xJPMmYqkWNVcsfiCi4SYkA+XTxU5Y3IpyqTEDbo6O+ovziqC9rqLpszeMEkj25OI3vPH92CNQIgRohUCMEaoRAjRCoEQI1Ak0NgRqBzIZAjXDKQ6BGCNQIgRohUKNQbHm1Do+MWsDq/G5VaZWzqRKGPp+9O0KvX7/+FZ07g9dPo7dPVi24rcP4I2i9/n99xm/GOQXckhaGyIlJajtpUzi2VFahGbOYRFiZ3DdgErgrjgRQwNIYHpGABBNmWEtLnTzRqupsl5z6zK42N6fuQZhUIjOc1vN3470ROoY5zqixxEwNyNMQJRCiBEKUQIgSCFECIUqgF+8Isy+KnbBebhqZ3e0jJ/omdx4UhpVfgegP0m3M5Z6JcuEAD3IAcpC2ONWURyhQsp0jT05n7/j+Eksks0gT9XlG6aYg0NuNZyWpO4dbY4nsOL7DdsOkWCiCKd1Mthgw73THoI+knijZS+vCcHECGtadZl1zG2pCUNhVLd9lCTKl5tkFFhFMrRNbLXSj9obIDFPMIhjkBCjOYIcviARLc/Zgp48M6u4eWYcPj3MSyFLNlux/3O+W/qU+SFhxMajLvh6J26It15HiNBU8FUTT88pCjHpSJ+zYochnPm33Jfpe9QplRPq0vG1PXzSfvWgT1xoPbYZ8p4G4BTea4EYT3GiCfTe40QQ3muBGE9xoghtNcKMJbjTBjSasSHCjCXviybvRVPReIdVpSHUaUp2GVKffNNXpzrXMwZEpODIFR6bgyBQcmUK601vSnZYnXU59GrKc4t4Wr69McoQhmM+9G009udX3ndDrmrD4IVD3mNKrPkDlKWVzO09trs7pCH1qZO2S4PJ1oQgzNIM89VBIzPWvmpjra11P0ckKmMowpRuvjMYCJ6CFpTUxsRopxZFjPKv0eFq0feAe/w4zZBUpsYjmrSSPiOElC37fSlW128WhhTA0jbBQE80ZTJ+g429DBn1EF2A7Vkn9hmaZQoxXw4DkgXN1lWgNAlCCY8jPeS42b0dsCopw69SWWNplmwEUD17rU/ORVxxwdzEn9727Z6RlNMBSmbSOuRs1I8psxN16UdtRiSwEYmxkwztht+ehPlw9dKwxKpKgtKhW73hxdtl2CXzkKOECOjeMuyZrU9RndPv1WXES34EnjQ7b7HGm1vP91Kuj6ZNPymZtQK23iy2v3Cu2qJ6RzVaEhGzBkzR4kgZP0uBJGlycgidp8CQNnqTBkzR4kgZP0uBJGjxJw4oET9KwJx7bk9Qq4ermgErxbcYAiWnVxDIDfS3nyRd6eh5w1/6wRjf1nXnD7tot1GGhf7fQbZ0FW1SJbdTj5xL1+K7S4NmXaKJrfbDyN3eCQ2RwiAwOkcEhMjhEBofIe7rXtHjW3OZUk7Pr9Yl/Cw5P85l1JrUoe/oc6jaOJ9ZLqcLcjIKZu38zt9457TuxsQ3b17G+83YeCRYyJgU7d7BzBz1QsHMHA0ywcwc7d7BzBzt3ILPBzh3s3MHOHezcwc4d7Nx+S8wINWIMXggwWX3qysSOBrdpFl0XlHdx4W1YojycTq863ECUKWhogfsyjlPAuqbFPF6rubdiD46WEF3XFcNwk9rQU8WR+fTjqPmKGGV9Zbqp5NGsTzn6cjduCiW99rfXoz44XxHcREvMFjARdcV4vaaJD98CCWcsbR6tWiA7YSgSXMphriDMJKAIS/symwCEUQJCf1aZcy0RRrNsA0J3xYhxNkwFSbDYFDpGOzBWtmHIbRZym4XcZiG32dYGyd3iMDjyBEee4MgTHHmCI8/TdeR58EXoRZglp7HLPCNbE5zVGtxG0U0bu1mcFtU+NmzPUERSojFgnFDQOSjHT1fxo3sYt5VMGrHqz5P3x9OvJfUPwYmdQzdK8vo2r6cyrA6azoRYpTYG4iXQePr9prdrlZp7lJjdRcbFRIBMOZPQmiut2aaSIq1ZXc86EXFKXSI0Ps9R4DvU3k3Mc4qhueAJwqX2hg16fKkHxysSQTMtVrW8uc65KGsbIvOC+Fpfj8ZcbzR0lDCwnIQALdIStii0KP1sZLySLbAVhS0352EcC5ASXYEgcxLZC/R8IxUk6Pnh1flecVXFsAKq5zSye3YU8eRgDTOcprKorIq8mnU9vDo/cxviyD146DfI9o8bfoWyaLVqIqdU2IKco6urRwFfWvx+CyxARCYymyVEKajyhvWaFr82TxE0n7wiMcS1V/U9QL2xh3a4tjR31ZomLO5qZlqeoCZ/X2U1ciuBRAtgICwV01RLlRHxo0QyhUifnK9YzYe/cJri6t3sCu61dFdEYo0GEOgwU0vQnKs7/lrUjMBf2b0xmTtNVNrM1GlTl96Rr/MJa7sfK7dpE1O66QMSm3YmNX3MXKY94d7laJxkjKhJZ9bHW5vdJhiVGUkjOkRcWILiDZ1Efp2iq99cooe7zST6pDOARkBS1cz/WSpuFY50NRofl26agiHOoxLzdKCibKNbGBeWTIIwm4PEmnjPN2URctTXO+w2Ja8umLR4ybfVhrfYw1vs4S323UY41SNjbGbdnS5tNwkoDdzwd2/WheMfjn84/iF08B4y473IJJ+r3D7LqzkhmnUtpJPPFSra5AxXJiG26DNOjOaZD82EzzPLn1p0trkbvnpVToyBxnO04Zn3N0TY0rF8nIXxVTLjsmrXgVm4w9MxUiJjEVbezGQw0ZtYvuON6Cmz3offwRb8L/8PAAD//w==
// DO NOT EDIT
package com.paypal.sdk.payments;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * A payment. Use this object to create, process, and manage payments.
 */
@Model
public class Payment {

    // Required default constructor
    public Payment() {}

	/**
	* The date and time when the payment was created, in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6).
	*/
	@SerializedName("create_time")
	private String createTime;

	public String createTime() { return createTime; }
	
	public Payment createTime(String createTime) {
	    this.createTime = createTime;
	    return this;
	}

	/**
	* The PayPal-generated ID for the merchant's payment experience profile. For information, see [create web experience profile](/docs/api/payment-experience/#web-profiles_create).
	*/
	@SerializedName("experience_profile_id")
	private String experienceProfileId;

	public String experienceProfileId() { return experienceProfileId; }
	
	public Payment experienceProfileId(String experienceProfileId) {
	    this.experienceProfileId = experienceProfileId;
	    return this;
	}

	/**
	* The reason code for a payment failure.
	*/
	@SerializedName("failure_reason")
	private String failureReason;

	public String failureReason() { return failureReason; }
	
	public Payment failureReason(String failureReason) {
	    this.failureReason = failureReason;
	    return this;
	}

	/**
	* The ID of the payment.
	*/
	@SerializedName("id")
	private String id;

	public String id() { return id; }
	
	public Payment id(String id) {
	    this.id = id;
	    return this;
	}

	/**
	* REQUIRED
	* The payment intent. Value is:<ul><li><code>sale</code>. Makes an immediate payment.</li><li><code>authorize</code>. [Authorizes a payment for capture later](/docs/integration/direct/payments/capture-payment/).</li><li><code>order</code>. [Creates an order](/docs/integration/direct/payments/orders/).</li></ul>
	*/
	@SerializedName("intent")
	private String intent;

	public String intent() { return intent; }
	
	public Payment intent(String intent) {
	    this.intent = intent;
	    return this;
	}

	/**
	* An array of request-related [HATEOAS links](/docs/api/overview/#hateoas-links).
	*/
	@SerializedName(value = "links", listClass = LinkDescriptionObject.class)
	private List<LinkDescriptionObject> links;

	public List<LinkDescriptionObject> links() { return links; }
	
	public Payment links(List<LinkDescriptionObject> links) {
	    this.links = links;
	    return this;
	}

	/**
	* A free-form field that clients can use to send a note to the payer.
	*/
	@SerializedName("note_to_payer")
	private String noteToPayer;

	public String noteToPayer() { return noteToPayer; }
	
	public Payment noteToPayer(String noteToPayer) {
	    this.noteToPayer = noteToPayer;
	    return this;
	}

	/**
	* REQUIRED
	* A payer who funds a payment.
	*/
	@SerializedName("payer")
	private Payer payer;

	public Payer payer() { return payer; }
	
	public Payment payer(Payer payer) {
	    this.payer = payer;
	    return this;
	}

	/**
	* A set of redirect URLs that you provide for PayPal-based payments.
	*/
	@SerializedName("redirect_urls")
	private RedirectUrls redirectUrls;

	public RedirectUrls redirectUrls() { return redirectUrls; }
	
	public Payment redirectUrls(RedirectUrls redirectUrls) {
	    this.redirectUrls = redirectUrls;
	    return this;
	}

	/**
	* The state of the payment, authorization, or order transaction. Value is:<ul><li><code>created</code>. The transaction was successfully created.</li><li><code>approved</code>. The buyer approved the transaction.</li><li><code>failed</code>. The transaction request failed.</li></ul>
	*/
	@SerializedName("state")
	private String state;

	public String state() { return state; }
	
	public Payment state(String state) {
	    this.state = state;
	    return this;
	}

	/**
	* An array of payment-related transactions. A transaction defines what the payment is for and who fulfills the payment. For update and execute payment calls, the **`transactions`** object accepts the **`amount`** object only.
	*/
	@SerializedName(value = "transactions", listClass = Transaction.class)
	private List<Transaction> transactions;

	public List<Transaction> transactions() { return transactions; }
	
	public Payment transactions(List<Transaction> transactions) {
	    this.transactions = transactions;
	    return this;
	}

	/**
	* The date and time when the payment was updated, in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6).
	*/
	@SerializedName("update_time")
	private String updateTime;

	public String updateTime() { return updateTime; }
	
	public Payment updateTime(String updateTime) {
	    this.updateTime = updateTime;
	    return this;
	}
}
