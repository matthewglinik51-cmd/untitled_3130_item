package Matthew_Glinik.P_jcf.A_Views;

import Matthew_Glinik.F_generics.Matthew_Glinik_Tool_Kit;

public interface InterfaceA<E> extends Matthew_Glinik_Tool_Kit<E> {
    E getFirst();
    E getLast();
    boolean addFirst(E given_value_to_add);
    E removeLast();
    E removeFirst();
    boolean addLast(E given_value_to_add);
    E setFirst(E given_value_to_set);
    E setLast(E given_value_to_set);

    default InterfaceA<E> view()
    {
        return new InterfaceA_VIEW(this);
    }

    class InterfaceA_VIEW<E> implements InterfaceA<E>
    {
        private InterfaceA<E> original;

        public InterfaceA_VIEW(InterfaceA<E> original)
        {
            this.original = original;
        }

        public InterfaceA<E> unmodifiable_view()
        {
            return new InterfaceA_unmodifiable_VIEW(this.original);
        }

        @Override
        public E getFirst() {
            String errorMessage = "did not specify \"unmodifiable_view()/modifiable_view()/resizeable_view()\". "
            throw new Exception(errorMessage);
        }

        @Override
        public E getLast() {
            String errorMessage = "did not specify \"unmodifiable_view()/modifiable_view()/resizeable_view()\". "
            throw new Exception(errorMessage);
        }

        @Override
        public boolean addFirst(E given_value_to_add) {
            String errorMessage = "did not specify \"unmodifiable_view()/modifiable_view()/resizeable_view()\". "
            throw new Exception(errorMessage);
        }

        @Override
        public E removeLast() {
            String errorMessage = "did not specify \"unmodifiable_view()/modifiable_view()/resizeable_view()\". "
            throw new Exception(errorMessage);
        }

        @Override
        public E removeFirst() {
            String errorMessage = "did not specify \"unmodifiable_view()/modifiable_view()/resizeable_view()\". "
            throw new Exception(errorMessage);
        }

        @Override
        public boolean addLast(E given_value_to_add) {
            String errorMessage = "did not specify \"unmodifiable_view()/modifiable_view()/resizeable_view()\". "
            throw new Exception(errorMessage);
        }

        @Override
        public E setFirst(E given_value_to_set) {
            String errorMessage = "did not specify \"unmodifiable_view()/modifiable_view()/resizeable_view()\". "
            throw new Exception(errorMessage);
        }

        @Override
        public E setLast(E given_value_to_set) {
            String errorMessage = "did not specify \"unmodifiable_view()/modifiable_view()/resizeable_view()\". "
            throw new Exception(errorMessage);
        }

        private class InterfaceA_unmodifiable_VIEW<E> implements InterfaceA<E>
        {
            private InterfaceA<E> original;

            public InterfaceA_unmodifiable_VIEW(InterfaceA<E> original)
            {
                this.original = UnmodifiableImplF_A<E>(original);
            }

            public InterfaceA<E> original_view()
            {
                return new InterfaceA_original_VIEW(this.original);
            }

            private class InterfaceA_original_VIEW<E> implements InterfaceA<E>
            {
                private InterfaceA<E> original;

                public InterfaceA_original_VIEW(InterfaceA<E> original)
                {
                    this.original = original;
                }

                @Override
                public E getFirst() {
                    return this.original.getFirst();
                }

                @Override
                public E getLast() {
                    return this.original.getLast();
                }

                @Override
                public boolean addFirst(E given_value_to_add) {
                    return this.original.addFirst(given_value_to_add);
                }

                @Override
                public E removeLast() {
                    return this.original.removeLast();
                }

                @Override
                public E removeFirst() {
                    return this.original.removeFirst();
                }

                @Override
                public boolean addLast(E given_value_to_add) {
                    return this.original.addLast(given_value_to_add);
                }

                @Override
                public E setFirst(E given_value_to_set) {
                    return this.original.setFirst(given_value_to_set);
                }

                @Override
                public E setLast(E given_value_to_set) {
                    return this.original.setLast(given_value_to_set);
                }
            }

            public InterfaceA<E> reversed_view()
            {
                return new InterfaceA_reversed_VIEW(this.original);
            }

            private class InterfaceA_reversed_VIEW<E> implements InterfaceA<E>
            {
                private InterfaceA<E> original;

                public InterfaceA_reversed_VIEW(InterfaceA<E> original)
                {
                    this.original = original;
                }

                @Override
                public E getFirst() {
                    return this.original.getLast();
                }

                @Override
                public E getLast() {
                    return this.original.getFirst();
                }

                @Override
                public boolean addFirst(E given_value_to_add) {
                    return this.original.addLast(given_value_to_add);
                }

                @Override
                public E removeLast() {
                    return this.original.removeFirst();
                }

                @Override
                public E removeFirst() {
                    return this.original.removeLast();
                }

                @Override
                public boolean addLast(E given_value_to_add) {
                    return this.original.addFirst(given_value_to_add);
                }

                @Override
                public E setFirst(E given_value_to_set) {
                    return this.original.setLast(given_value_to_set);
                }

                @Override
                public E setLast(E given_value_to_set) {
                    return this.original.setFirst(given_value_to_set);
                }
            }
        }

        public InterfaceA<E> modifiable_view()
        {
            return new InterfaceA_modifiable_VIEW(this.original);
        }

        private class InterfaceA_modifiable_VIEW<E> implements InterfaceA<E>
        {}

        public InterfaceA<E> resizeable_view()
        {
            return new InterfaceA_resizeable_VIEW(this.original);
        }

        private class InterfaceA_resizeable_VIEW<E> implements InterfaceA<E>
        {}
    }
}
