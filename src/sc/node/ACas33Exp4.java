/* This file was generated by SableCC (http://www.sablecc.org/). */

package sc.node;

import sc.analysis.*;

@SuppressWarnings("nls")
public final class ACas33Exp4 extends PExp4
{
    private PExp4 _exp4_;
    private TMoins _moins_;
    private PExp5 _exp5_;

    public ACas33Exp4()
    {
        // Constructor
    }

    public ACas33Exp4(
        @SuppressWarnings("hiding") PExp4 _exp4_,
        @SuppressWarnings("hiding") TMoins _moins_,
        @SuppressWarnings("hiding") PExp5 _exp5_)
    {
        // Constructor
        setExp4(_exp4_);

        setMoins(_moins_);

        setExp5(_exp5_);

    }

    @Override
    public Object clone()
    {
        return new ACas33Exp4(
            cloneNode(this._exp4_),
            cloneNode(this._moins_),
            cloneNode(this._exp5_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseACas33Exp4(this);
    }

    public PExp4 getExp4()
    {
        return this._exp4_;
    }

    public void setExp4(PExp4 node)
    {
        if(this._exp4_ != null)
        {
            this._exp4_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._exp4_ = node;
    }

    public TMoins getMoins()
    {
        return this._moins_;
    }

    public void setMoins(TMoins node)
    {
        if(this._moins_ != null)
        {
            this._moins_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._moins_ = node;
    }

    public PExp5 getExp5()
    {
        return this._exp5_;
    }

    public void setExp5(PExp5 node)
    {
        if(this._exp5_ != null)
        {
            this._exp5_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._exp5_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._exp4_)
            + toString(this._moins_)
            + toString(this._exp5_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._exp4_ == child)
        {
            this._exp4_ = null;
            return;
        }

        if(this._moins_ == child)
        {
            this._moins_ = null;
            return;
        }

        if(this._exp5_ == child)
        {
            this._exp5_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._exp4_ == oldChild)
        {
            setExp4((PExp4) newChild);
            return;
        }

        if(this._moins_ == oldChild)
        {
            setMoins((TMoins) newChild);
            return;
        }

        if(this._exp5_ == oldChild)
        {
            setExp5((PExp5) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
