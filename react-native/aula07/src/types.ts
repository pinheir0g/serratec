import { ReactNode } from "react";

export type Tasks = {
    id: string;
    title: string;
    description: string;
    status: string;
}

export type PropsChildren = {
    children: ReactNode;
};
