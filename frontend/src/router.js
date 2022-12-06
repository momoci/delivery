
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import OrderListManager from "./components/listers/OrderListCards"
import OrderListDetail from "./components/listers/OrderListDetail"
import PaymentStatusManager from "./components/listers/PaymentStatusCards"
import PaymentStatusDetail from "./components/listers/PaymentStatusDetail"

import FoodCookingManager from "./components/listers/FoodCookingCards"
import FoodCookingDetail from "./components/listers/FoodCookingDetail"

import DeliveryManager from "./components/listers/DeliveryCards"
import DeliveryDetail from "./components/listers/DeliveryDetail"


import MyPageView from "./components/MyPageView"
import MyPageViewDetail from "./components/MyPageViewDetail"

export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/orderLists',
                name: 'OrderListManager',
                component: OrderListManager
            },
            {
                path: '/orderLists/:id',
                name: 'OrderListDetail',
                component: OrderListDetail
            },
            {
                path: '/paymentStatuses',
                name: 'PaymentStatusManager',
                component: PaymentStatusManager
            },
            {
                path: '/paymentStatuses/:id',
                name: 'PaymentStatusDetail',
                component: PaymentStatusDetail
            },

            {
                path: '/foodCookings',
                name: 'FoodCookingManager',
                component: FoodCookingManager
            },
            {
                path: '/foodCookings/:id',
                name: 'FoodCookingDetail',
                component: FoodCookingDetail
            },

            {
                path: '/deliveries',
                name: 'DeliveryManager',
                component: DeliveryManager
            },
            {
                path: '/deliveries/:id',
                name: 'DeliveryDetail',
                component: DeliveryDetail
            },


            {
                path: '/myPages',
                name: 'MyPageView',
                component: MyPageView
            },
            {
                path: '/myPages/:id',
                name: 'MyPageViewDetail',
                component: MyPageViewDetail
            },


    ]
})
